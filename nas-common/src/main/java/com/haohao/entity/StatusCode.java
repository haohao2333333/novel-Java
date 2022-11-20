package com.haohao.entity;

/**
 * 返回码
 */
public class StatusCode {
    public static final int OK = 200;//成功
    public static final int ERROR = 201;//失败
    public static final int LOGINERROR = 202;//用户名或密码错误
    public static final int ACCESSERROR = 203;//权限不足
    public static final int REMOTEERROR = 204;//远程调用失败
    public static final int REPERROR = 205;//重复操作
}
