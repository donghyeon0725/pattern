package com.design.pattern.objectStructure.proxy.after;

import com.design.pattern.objectStructure.proxy.before.GameService;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
