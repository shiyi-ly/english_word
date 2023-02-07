package com.english.word.service;

import com.english.word.entity.mybatis.VocabularyEverydayRecordEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户每天推送单词表 服务类
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
public interface VocabularyEverydayRecordService extends IService<VocabularyEverydayRecordEntity> {
    /**
     * 查询用户已学习过的题目
     */
    List<VocabularyEverydayRecordEntity> listByUserId(Integer userId);
}
