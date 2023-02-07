package com.english.word.mapper;

import com.english.word.entity.mybatis.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 分类 Mapper 接口
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {

}
