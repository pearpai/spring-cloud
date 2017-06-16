package com.bq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 负载服务器
 * Created by wuyunfeng on 2017/6/15.
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerClient consumerClient;

    @GetMapping("/add")
    public Integer add() {
        return consumerClient.add(10, 20);
    }


}
