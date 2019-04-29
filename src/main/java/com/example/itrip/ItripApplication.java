package com.example.itrip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.dao")
public class ItripApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItripApplication.class, args);
    }

}
