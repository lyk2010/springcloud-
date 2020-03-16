package com.kevin.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author kevin
 * @create 2020/3/12
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 使用@LoadBalanced注解赋予RestTemplate 负载均衡的能力
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
