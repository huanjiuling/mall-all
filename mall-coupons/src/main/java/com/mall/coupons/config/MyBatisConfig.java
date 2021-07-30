package com.mall.coupons.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.mall.mbg.mapper","com.mall.coupons.dao"})
public class MyBatisConfig {

}
