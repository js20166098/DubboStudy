package com.js.controller;

import com.js.dubbo.TestDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class TestController {

    @Autowired
    private TestDubbo testDubbo;

    @GetMapping("/test")
    public String getString(){
        CompletableFuture.supplyAsync(()->{
            System.out.println("异步执行");
            return testDubbo.test();
        });
        return "success";
    }
}
