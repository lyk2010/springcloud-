package com.kevin.springcloud.service.Impl;

import com.kevin.springcloud.dao.PaymentDao;
import com.kevin.springcloud.entities.Payment;
import com.kevin.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kevin
 * @create 2020/3/12
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    /**
     * 保存
     * @param payment
     * @return
     */
    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }


    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @Override
    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }
}
