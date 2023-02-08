package com.english.word.task;

import com.alibaba.fastjson.JSON;
import com.english.word.entity.mybatis.SysUserConfigEntity;
import com.english.word.entity.mybatis.SysUserEntity;
import com.english.word.entity.mybatis.VocabularyEntity;
import com.english.word.entity.mybatis.VocabularyEverydayRecordEntity;
import com.english.word.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling
public class VocabularyEveryDay {

    @Autowired
    private SysUserConfigService userConfigService;
    @Autowired
    private VocabularyEverydayRecordService everydayRecordService;
    @Autowired
    private VocabularyService vocabularyService;
    @Autowired
    private IMailService iMailService;
    @Autowired
    private SysUserService userService;

    /**
     * 每天8点半随机推送10个单词，不重复
     */
    @Scheduled(cron = "0 30 8 ? * *")
    public void vocabularyTask() {
        List<String> englishs = new ArrayList<>();
        List<SysUserConfigEntity> list = userConfigService.list();
        if (list.size() == 0) {
            return;
        }
        for (SysUserConfigEntity entity : list) {
            // 分类
            Integer categoryId = entity.getCategoryId();
            // 条数
            Integer vocabularyNum = entity.getVocabularyNum();
            SysUserEntity userEntity = userService.getById(entity.getUserId());
            // 查询用户已经学习过哪些题了
            List<VocabularyEverydayRecordEntity> vocabularyEverydayRecordEntities =
                    everydayRecordService.listByUserId(entity.getUserId());
            if (vocabularyEverydayRecordEntities.size() != 0) {
                englishs = vocabularyEverydayRecordEntities.stream().map(VocabularyEverydayRecordEntity::getEnglishWord).collect(Collectors.toList());
            }
            // 查询题库并排除已经学习过的题目
            List<VocabularyEntity> vocabularyEntities = vocabularyService.listByEnglish(englishs, 0, vocabularyNum, categoryId);
            // 插入表中
            List<VocabularyEverydayRecordEntity> recordEntities = new ArrayList<>();
            vocabularyEntities.forEach(x -> recordEntities.add(new VocabularyEverydayRecordEntity(x, entity.getUserId())));
            boolean b = everydayRecordService.saveBatch(recordEntities);
            iMailService.sendSimpleMailMessage(userEntity.getDescription(), "每日必读单词", JSON.toJSONString(recordEntities));
            log.info("用户：{}, 内容:{}, 保存成功：{}", entity.getUserId(),recordEntities, b);
        }
    }
}
