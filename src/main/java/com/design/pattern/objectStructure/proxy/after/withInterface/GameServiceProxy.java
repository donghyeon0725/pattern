package com.design.pattern.objectStructure.proxy.after.withInterface;

public class GameServiceProxy implements GameService {
    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }


    @Override
    public void startGame() {
        long before = System.currentTimeMillis();

        if (gameService == null) {
            gameService = new DefaultGameService();
        }
        gameService.startGame();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
