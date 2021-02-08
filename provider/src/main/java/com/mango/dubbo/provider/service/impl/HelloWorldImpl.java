package com.mango.dubbo.provider.service.impl;

import com.mango.dubbo.api.service.HelloWorld;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author 凌风的MI
 * @date 2021/2/8
 */
@Component
@Service
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String message) {
        return "api-sayHello:" + message;
    }
}
