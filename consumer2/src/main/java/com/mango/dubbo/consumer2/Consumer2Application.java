package com.mango.dubbo.consumer2;

import com.mango.dubbo.consumer2.controller.HelloController2;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 凌风的MI
 * @date 2021/2/8
 */
@EnableDubboConfig
@SpringBootApplication
public class Consumer2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Consumer2Application.class, args);
        HelloController2 helloController2 = context.getBean("helloController2", HelloController2.class);
        helloController2.helloWorld("第二步成功了吧");
    }

}
