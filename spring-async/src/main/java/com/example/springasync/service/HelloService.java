package com.example.springasync.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class HelloService {

    @Async
    public void longProcess(){
        try{
            Thread.sleep(10000);
        }catch (InterruptedException exe){
            exe.printStackTrace();
        }
        System.out.println("Took 10 seconds to complete on thread named: " +Thread.currentThread());
    }

}
