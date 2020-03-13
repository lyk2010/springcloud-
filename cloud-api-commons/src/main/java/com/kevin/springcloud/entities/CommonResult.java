package com.kevin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kevin
 * @create 2020/3/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    /**
     * 返回码
     */
    private Integer code;


    /**
     * 返回信息
     */
    private String msg;


    /**
     * 返回数据
     */
    private T  data;


    public CommonResult(Integer code, String msg){
        this(code,msg,null);
    }
}
