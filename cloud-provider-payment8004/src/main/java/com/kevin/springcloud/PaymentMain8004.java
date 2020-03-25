package com.kevin.springcloud;/**
 * @Author: kevin
 * @Date: 2020/3/16 13:08
 * @Description: (一句话描述该类的功能)
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: PaymentMain8004
 * @description: TODO
 * @author: kevin
 * @createDate: 2020/3/16 13:08
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
