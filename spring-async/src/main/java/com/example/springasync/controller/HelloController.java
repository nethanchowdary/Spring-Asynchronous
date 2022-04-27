package com.example.springasync.controller;

import com.example.springasync.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        long start=System.currentTimeMillis();
        helloService.longProcess();;
        long end=System.currentTimeMillis();

        return "Hello took "+(end-start)+" milliseconds and current thread is : "+ Thread.currentThread().getName();
    }
}
