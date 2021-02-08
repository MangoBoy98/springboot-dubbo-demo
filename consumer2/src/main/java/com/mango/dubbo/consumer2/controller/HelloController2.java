package com.mango.dubbo.consumer2.controller;

import com.mango.dubbo.api.service.HelloWorld;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;

/**
 * @author 凌风的MI
 * @date 2021/2/8
 */
@Controller
public class HelloController2 {

    @Reference(url = "dubbo://localhost:20880")
    private HelloWorld helloWorld;

    public void helloWorld(String message) {
        System.err.println(helloWorld.sayHello(message));
    }
}
