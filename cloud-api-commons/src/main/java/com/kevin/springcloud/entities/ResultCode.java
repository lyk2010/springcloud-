package com.kevin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 结果状态枚举
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResultCode {
    SUCCESS(10001, "成功"),
    FAILURE(10002, "失败"),
    UNKNOWN_ERROR(10003, "未知错误"),
    SYSTEM_INNER_ERROR(10004, "系统繁忙，请稍后重试"),
    PARAM_VALIDATE_SUCCESS(10005, "参数校验成功"),

    /* 参数错误：20001-29999 */
    PARAM_IS_INVALID(20001, "参数无效"),
    PARAM_IS_BLANK(20002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(20003, "参数类型错误"),
    PARAM_NOT_COMPLETE(20004, "参数缺失");

    // 结果状态码
    private Integer code;

    // 结果消息
    private String message;


}
