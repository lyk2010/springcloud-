package com.kevin.springcloud.dao;

import com.kevin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * dao接口
 */
@Mapper
public interface PaymentDao {

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
