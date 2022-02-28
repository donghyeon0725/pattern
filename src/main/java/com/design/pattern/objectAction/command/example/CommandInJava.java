package com.design.pattern.objectAction.command.example;

import com.design.pattern.objectAction.command.after.Game;
import com.design.pattern.objectAction.command.after.GameCommand;
import com.design.pattern.objectAction.command.after.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {
    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                light.on();
//            }
//        });
        executorService.submit(light::on);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
