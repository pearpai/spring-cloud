package com.bq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * app
 * Created by wuyunfeng on 2017/6/14.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class BqFeignApplication {



    public static void main(String[] args) {
        SpringApplication.run(BqFeignApplication.class, args);
    }

}
