package com.kevin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kevin
 * @create 2020/3/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    /**
     * 消息状态码
     */
    private Integer code;


    /**
     * 返回消息
     */
    private String msg;


    /**
     * 返回数据
     */
    private T  data;

    public CommonResult(Integer code,String msg){
        this(code,msg,null);
    }

    /**
     * 根据状态码枚举设置状态码和状态信息的值
     * @param code 状态码枚举
     */
    public void setResultCode(ResultCode code) {
        this.code = code.getCode();
        this.msg = code.getMessage();
    }
}
