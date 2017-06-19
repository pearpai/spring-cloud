package com.bq;

import com.bq.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * app
 * Created by wuyunfeng on 2017/6/14.
 */
@SpringCloudApplication
@EnableZuulProxy
public class BqZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BqZuulApplication.class, args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

}
