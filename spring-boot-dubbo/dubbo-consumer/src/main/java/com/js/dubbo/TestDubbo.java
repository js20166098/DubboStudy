package com.js.dubbo;

import com.js.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestDubbo {

    @Autowired
    private DemoService demoService;

    public String test(){
        log.info("======================");
        String result = demoService.sayHello("jsp");
        log.info("----------------------");
        return result;
    }
}
