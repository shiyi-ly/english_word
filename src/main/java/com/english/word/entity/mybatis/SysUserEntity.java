package com.english.word.entity.mybatis;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Data
@TableName("sys_user")
@ApiModel(value="SysUserEntity对象", description="")
public class SysUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户code")
    @TableField("user_code")
    private String userCode;

    @ApiModelProperty(value = "用户姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "用户登录密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "用户描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "用户状态")
    @TableField("status")
    private Integer status;
}
