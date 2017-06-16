package com.bq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * app
 * Created by wuyunfeng on 2017/6/14.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class BqConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BqConfigApplication.class, args);
    }

}
