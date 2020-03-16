package com.kevin.springcloud.service;

import com.kevin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author kevin
 * @create 2020/3/12
 */
public interface PaymentService {

    /**
     * 新增
     * @param payment
     * @return
     */
    public int save(Payment payment);


    /**
     * 通过ID查询
     * @param id
     * @return
     */
    public Payment findById(@Param("id") Long id);
}
