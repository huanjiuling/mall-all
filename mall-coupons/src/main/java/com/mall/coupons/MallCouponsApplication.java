package com.mall.coupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MallCouponsApplication {

    public static void main(String[] args) {

        SpringApplication.run(MallCouponsApplication.class, args);
    }

}
