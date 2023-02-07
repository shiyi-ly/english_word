package com.english.word.mapper;

import com.english.word.entity.mybatis.VocabularyEverydayRecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户每天推送单词表 Mapper 接口
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Mapper
public interface VocabularyEverydayRecordMapper extends BaseMapper<VocabularyEverydayRecordEntity> {

}
