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
public class Payment {
    /**
     * 主键ID
     */
    private Long id;


    /**
     * 支付号
     */
    private String serial;
}
