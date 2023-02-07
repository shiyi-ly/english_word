package com.english.word.common.utils.response;

/**
 * @Date 2022/3/1 16:19
 * @Created by wlh
 */
public interface CommonConstants {

    /**
     * 成功标记
     */
    Integer SUCCESS = 0;

    /**
     * 失败标记
     */
    Integer FAIL = 1;

    /**
     * 登录相关
     */
    String EMPTY_CODE_OR_PWD = "用户名或密码不能为空";
    String FAIL_CODE_OR_PWD = "用户名或者密码不正确";
    String NO_AUTH = "无权限登录";
    String NO_USER = "用户不存在";
    // 密码加盐
    String SALT = "zlhy";
    // 默认密码
    String PWD = "111111";
    String EXISTED_USER = "用户编码已经存在";


    int EXPIRE_DATE = 30;
}
