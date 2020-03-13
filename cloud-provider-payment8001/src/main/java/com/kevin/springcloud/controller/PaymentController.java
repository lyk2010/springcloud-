package com.kevin.springcloud.controller;

import com.kevin.springcloud.entities.CommonResult;
import com.kevin.springcloud.entities.Payment;
import com.kevin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author kevin
 * @create 2020/3/12
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @PostMapping(value = "/payment/save")
    public CommonResult save(@RequestBody Payment payment){
        int result = paymentService.save(payment);
        log.info("===插入结果:"+result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功！",result);
        }else {
            return new CommonResult(444,"插入数据库失败！",null);
        }
    }


    @GetMapping(value = "/payment/findById/{id}")
    public CommonResult findById(@PathVariable("id") Long id){
        Payment payment = paymentService.findById(id);
        log.info("===根据ID查询结果:"+payment);

        if (payment != null){
            return new CommonResult(200,"成功！",payment);
        }else {
            return new CommonResult(444,"失败！没有对应记录，查询ID："+id,null);
        }
    }


}
