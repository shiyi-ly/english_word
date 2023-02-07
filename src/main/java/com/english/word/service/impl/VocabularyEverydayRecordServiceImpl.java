package com.english.word.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.english.word.entity.mybatis.VocabularyEverydayRecordEntity;
import com.english.word.mapper.VocabularyEverydayRecordMapper;
import com.english.word.service.VocabularyEverydayRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户每天推送单词表 服务实现类
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Service
public class VocabularyEverydayRecordServiceImpl extends ServiceImpl<VocabularyEverydayRecordMapper, VocabularyEverydayRecordEntity> implements VocabularyEverydayRecordService {

    @Override
    public List<VocabularyEverydayRecordEntity> listByUserId(Integer userId) {
        LambdaQueryWrapper<VocabularyEverydayRecordEntity> wrapper = Wrappers.<VocabularyEverydayRecordEntity>lambdaQuery()
                .eq(VocabularyEverydayRecordEntity::getUserId, userId);
        return list(wrapper);
    }
}
