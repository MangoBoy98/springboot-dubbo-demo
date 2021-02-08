package com.mango.dubbo.consumer1;

import com.mango.dubbo.consumer1.controller.HelloController1;
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
public class Consumer1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Consumer1Application.class, args);
		HelloController1 helloController1 = context.getBean("helloController1", HelloController1.class);
		helloController1.helloWorld("第一步成功了吧");
	}

}
