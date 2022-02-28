package com.design.pattern.objectStructure.proxy.after.withInterface;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }
}
