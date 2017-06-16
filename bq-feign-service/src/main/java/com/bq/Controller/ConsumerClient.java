package com.bq.Controller;

import com.bq.bean.ConsumerClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wuyunfeng on 2017/6/16.
 */
@FeignClient(value = "bq-client-service", fallback = ConsumerClientHystrix.class)
public interface ConsumerClient {
    @GetMapping("/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
