package com.js.controller;

import com.js.dubbo.SayHelloDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private SayHelloDubbo sayHello;

    @GetMapping("test")
    public String sayHello() {
        return sayHello.sayHello();
    }
}
