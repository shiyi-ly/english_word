package com.english.word.service;

import com.english.word.entity.mybatis.VocabularyEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 词汇 服务类
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
public interface VocabularyService extends IService<VocabularyEntity> {
    /**
     * 查询随机条数
     */
    List<VocabularyEntity> listByEnglish(List<String> englishs, int status, Integer vocabularyNum, Integer category);
}
