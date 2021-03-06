package com.bq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * app
 * Created by wuyunfeng on 2017/6/14.
 */
@SpringCloudApplication
public class BqClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BqClientApplication.class, args);
    }

}
