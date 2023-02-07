package com.english.word.entity.mybatis;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

/**
 * <p>
 * 用户每天推送单词表
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("vocabulary_everyday_record")
@ApiModel(value="VocabularyEverydayRecordEntity对象", description="用户每天推送单词表")
public class VocabularyEverydayRecordEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "分类id")
    @TableField("category_id")
    private Integer categoryId;

    @ApiModelProperty(value = "英文单词")
    @TableField("chinese_word")
    private String chineseWord;

    @ApiModelProperty(value = "中文翻译")
    @TableField("english_word")
    private String englishWord;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty(value = "状态（0未完成，1已完成）")
    @TableField("vo_status")
    private Integer voStatus;

    public VocabularyEverydayRecordEntity(VocabularyEntity entity, Integer userId) {
        BeanUtils.copyProperties(entity, this);
        this.userId = userId;
        this.voStatus = 0;
    }
}
