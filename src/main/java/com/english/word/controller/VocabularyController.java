package com.english.word.controller;

import com.english.word.common.utils.response.R;
import com.english.word.common.utils.validate.Group;
import com.english.word.common.utils.validate.ValidatorUtils;
import com.english.word.entity.mybatis.VocabularyEntity;
import com.english.word.service.VocabularyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 词汇 前端控制器
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Api(tags = "词汇")
@RestController
@RequestMapping("/vocabulary")
public class VocabularyController {

    @Autowired
    private VocabularyService vocabularyService;

    @ApiOperation("新增修改词汇")
    @PostMapping("/saveOrUpdate")
    public R saveOrUpdate(@RequestBody VocabularyEntity entity) {
        ValidatorUtils.validateEntity(entity, Group.class);
        vocabularyService.saveOrUpdate(entity);
        return R.buildSuccess(null);
    }

}

