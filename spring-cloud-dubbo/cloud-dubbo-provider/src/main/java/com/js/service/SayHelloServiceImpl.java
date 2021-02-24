package com.js.service;

import com.js.api.ISayHelloService;
import org.springframework.stereotype.Service;

@Service
public class SayHelloServiceImpl implements ISayHelloService {

    @Override
    public String sayHello(String msg) {
        return "Hello, www.baidu.com" + msg;
    }
}
