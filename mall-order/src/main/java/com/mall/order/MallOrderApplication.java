package com.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@EnableFeignClients
@SpringBootApplication(exclude = {SpringBootConfiguration.class})
public class MallOrderApplication {

    private static ApplicationContext applicationContext;


    public static void main(String[] args) {
        applicationContext = SpringApplication.run(MallOrderApplication.class, args);
    }

    public static <T> T getBean(String beanName) {
        return applicationContext != null ? (T) applicationContext.getBean(beanName) : null;
    }

}
