package com.english.word.service.impl;

import com.english.word.entity.mybatis.CategoryEntity;
import com.english.word.mapper.CategoryMapper;
import com.english.word.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类 服务实现类
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryEntity> implements CategoryService {

}
