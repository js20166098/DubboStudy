package com.js.service;

import com.js.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        log.info("当前服务被申请访问");
        return "Hello " + name;
    }
}