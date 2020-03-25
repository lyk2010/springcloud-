package com.kevin.springcloud;/**
 * @Author: kevin
 * @Description: (一句话描述该类的功能)
 * @Date: 2020/3/16 8:25
 * @version v1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: kevin
 * @createDate: 2020/3/16 8:25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
