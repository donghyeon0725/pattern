package com.design.pattern.objectAction.observer.example.springSample1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarter {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootStarter.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
}
