package com.english.word.entity.mybatis;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
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
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "用户状态")
    @TableField("status")
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysUserEntity{" +
        "id=" + id +
        ", userCode=" + userCode +
        ", name=" + name +
        ", password=" + password +
        ", description=" + description +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", status=" + status +
        "}";
    }
}
