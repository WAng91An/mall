package com.mall.common;

/**
 * Created by wangqian on 2018/12/29.
 */
public enum  ResponseCode {

    /**
     * 响应状态码的枚举
     */
    SUCCESS(0,"SUCCESS"), //响应成功
    ERROR(1,"ERROR"), //响应错误
    NEED_LOGIN(10,"NEED_LOGIN"), //需要登陆
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT"); //不合法的参数

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
