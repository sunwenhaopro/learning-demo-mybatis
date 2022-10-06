package com.example.swh.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.swh.mapper")
public class MybatisConfig {
}
