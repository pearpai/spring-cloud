package com.bq.Controller;

import com.bq.service.ConsumerService;
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
    ConsumerService consumerService;



    @GetMapping("/add")
    public String add(){
        return consumerService.addService();
    }

}
