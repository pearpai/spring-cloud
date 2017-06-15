package com.bq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 负载服务器
 * Created by wuyunfeng on 2017/6/15.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/add")
    public String add(){
        return restTemplate.getForEntity("http://BQ-CLIENT-SERVICE/add?a=10&b=20", String.class).getBody();
    }

}
