package com.english.word.common.utils.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Date 2022/4/19 17:19
 * @Created by wlh
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
@ApiModel(value = "R统一返回类",description = "统一返回类")
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    @ApiModelProperty("状态码 0-成功 1-失败")
    private int code = CommonConstants.SUCCESS;

    @Getter
    @Setter
    @ApiModelProperty("返回提示信息")
    private String msg = "success";


    @Getter
    @Setter
    @ApiModelProperty("返回数据")
    private T data;

    public R() {
        super();
    }

    public R(T data) {
        super();
        this.data = data;
    }

    public R(T data, String msg) {
        super();
        this.data = data;
        this.msg = msg;
    }

    public R(Throwable e) {
        super();
        this.msg = e.getMessage();
        this.code = CommonConstants.FAIL;
    }

    public static R buildSuccess(Object data){
        return new R<>(data);
    }

    public static R buildFail(String message){
        R r = new R();
        r.msg = message;
        r.code = CommonConstants.FAIL;
        return r;
    }

}
