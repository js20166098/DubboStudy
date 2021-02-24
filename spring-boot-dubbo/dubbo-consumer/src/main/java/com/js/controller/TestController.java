package com.js.controller;

import com.js.dubbo.TestDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestDubbo testDubbo;

    @GetMapping("/test")
    public String getString(){
        return testDubbo.test();
    }
}
