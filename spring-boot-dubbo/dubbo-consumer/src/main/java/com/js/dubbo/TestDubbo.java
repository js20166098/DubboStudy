package com.js.dubbo;

import com.js.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDubbo {

    @Autowired
    private DemoService demoService;

    public String test(){
        System.out.println("======================");
        String result = demoService.sayHello("jsp");
        System.out.println("----------------------");
        return result;
    }
}
