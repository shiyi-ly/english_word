package com.english.word.entity.mybatis;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户每天推送条数
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Data
@TableName("sys_user_config")
@ApiModel(value="SysUserConfigEntity对象", description="用户每天推送条数")
public class SysUserConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty(value = "分类id")
    @TableField("category_id")
    private Integer categoryId;

    @ApiModelProperty(value = "条数")
    @TableField("vocabulary_num")
    private Integer vocabularyNum;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
