package com.english.word.entity.mybatis;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 词汇
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Data
@TableName("vocabulary")
@ApiModel(value="VocabularyEntity对象", description="词汇")
public class VocabularyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "分类id")
    @TableField("category_id")
    private Integer categoryId;

    @ApiModelProperty(value = "英文单词")
    @TableField("english_word")
    private String englishWord;

    @ApiModelProperty(value = "中文翻译")
    @TableField("chinese_word")
    private String chineseWord;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
