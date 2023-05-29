package com.gspann.springbootproject1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration
@Profile("dev")
public class JavaProdConfig {
     @PostConstruct
    public  void test(){

System.out.println("Dev Environment loaded....!!!!");

    }
}
