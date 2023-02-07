package com.english.word.service.impl;

import com.english.word.entity.mybatis.VocabularyEntity;
import com.english.word.mapper.VocabularyMapper;
import com.english.word.service.VocabularyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 词汇 服务实现类
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Service
public class VocabularyServiceImpl extends ServiceImpl<VocabularyMapper, VocabularyEntity> implements VocabularyService {

}
