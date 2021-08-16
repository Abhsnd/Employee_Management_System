package com.kuangshen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kuangshen.mapper")
public class SpringbootWeb02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWeb02Application.class, args);
    }

}
