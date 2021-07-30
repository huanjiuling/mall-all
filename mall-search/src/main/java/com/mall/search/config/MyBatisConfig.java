package com.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.mall.mbg.mapper","com.mall.search.dao"})
public class MyBatisConfig {
}
