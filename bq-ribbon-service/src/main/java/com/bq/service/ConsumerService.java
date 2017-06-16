package com.bq.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wuyunfeng on 2017/6/16.
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){
        return restTemplate.getForEntity("http://BQ-CLIENT-SERVICE/add?a=10&b=20", String.class).getBody();
    }


    public String addServiceFallback() {
        return "error";
    }

}
