package com.design.pattern.objectStructure.proxy.after;

import com.design.pattern.objectStructure.proxy.before.GameService;


public class GameServiceProxy extends GameService {

    @Override
    public void startGame()  {
        long before = System.currentTimeMillis();
        super.startGame();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
