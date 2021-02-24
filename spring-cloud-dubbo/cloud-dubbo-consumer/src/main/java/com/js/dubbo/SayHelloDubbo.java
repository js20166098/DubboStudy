package com.js.dubbo;

import com.js.api.ISayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayHelloDubbo {


    @Autowired
    private ISayHelloService sayHelloService;

    public String sayHello() {
        System.out.println("MyTest ====================");
        String result = sayHelloService.sayHello("jsb");
        System.out.println("result=====================");
        return result;
    }
}
