package com.bq.bean;

import com.bq.Controller.ConsumerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wuyunfeng on 2017/6/16.
 */
@Component
public class ConsumerClientHystrix implements ConsumerClient {


    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -99999;
    }
}
