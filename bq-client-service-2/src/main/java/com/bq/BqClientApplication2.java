package com.bq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * app
 * Created by wuyunfeng on 2017/6/14.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BqClientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(BqClientApplication2.class, args);
    }

}
