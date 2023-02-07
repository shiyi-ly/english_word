package com.english.word.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.english.word.common.exception.BusinessException;
import com.english.word.common.utils.validate.ValidatorUtils;
import com.english.word.entity.mybatis.VocabularyEntity;
import com.english.word.mapper.VocabularyMapper;
import com.english.word.service.VocabularyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Override
    public List<VocabularyEntity> listByEnglish(List<String> englishs, int status, Integer vocabularyNum, Integer category) {
        LambdaQueryWrapper<VocabularyEntity> wrapper = Wrappers.<VocabularyEntity>lambdaQuery()
                .eq(ValidatorUtils.nonNullAndEmpty(category), VocabularyEntity::getCategoryId, category);
        if (status == 0) {
           wrapper.notIn(ValidatorUtils.nonNullAndEmpty(englishs), VocabularyEntity::getEnglishWord, englishs);
        }
        List<VocabularyEntity> entities = this.list(wrapper);
        if (entities.size() == 0) {
            return new ArrayList<>();
        }
        if (entities.size() <= vocabularyNum) {
            return entities;
        }
        List<VocabularyEntity> vocabularyEntities = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < vocabularyNum; i++) {
            VocabularyEntity entity = entities.get(getRandom(map, vocabularyNum));
            vocabularyEntities.add(entity);
        }
        return vocabularyEntities;
    }

    /**
     * 获取循环数
     */
    private int getRandom(Map<Integer, Integer> map, Integer vocabularyNum) {
        while (true) {
            int number = new Random().nextInt(vocabularyNum) + 1;
            Integer integer = map.get(number);
            if (integer == null) {
                map.put(number, 0);
                return number;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
    }
}
