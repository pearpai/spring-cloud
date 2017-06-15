package com.bq.Controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;


/**
 *
 * Created by wuyunfeng on 2017/6/14.
 */
@RestController
public class DemoController {

    private final Logger logger = Logger.getLogger(getClass());

    private final DiscoveryClient discoveryClient;

    @Autowired
    public DemoController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }


    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {

        ServiceInstance instance = discoveryClient.getLocalServiceInstance();

        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

}