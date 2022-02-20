package com.design.pattern.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String helloBean() {
        return "hello";
    }
}
