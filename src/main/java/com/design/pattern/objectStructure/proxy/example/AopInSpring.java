package com.design.pattern.objectStructure.proxy.example;

import com.design.pattern.objectStructure.proxy.after.withInterface.GameService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopInSpring {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AopInSpring.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

    @Bean
    public ApplicationRunner applicationRunner(GameService gameService) {
        return a -> gameService.startGame();
    }
}
