package com.english.word.controller;


import com.english.word.common.utils.response.R;
import com.english.word.common.utils.validate.Group;
import com.english.word.common.utils.validate.ValidatorUtils;
import com.english.word.entity.mybatis.VocabularyEntity;
import com.english.word.service.IMailService;
import com.english.word.service.impl.IMailServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 分类 前端控制器
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@RestController
@RequestMapping("/category")
public class CategoryController {



    @ApiOperation("新增修改词汇")
    @GetMapping("/saveOrUpdate")
    public R get() {
        return R.buildSuccess(null);
    }
}

