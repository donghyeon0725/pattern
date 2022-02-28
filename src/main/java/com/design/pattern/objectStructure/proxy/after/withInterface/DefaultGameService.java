package com.design.pattern.objectStructure.proxy.after.withInterface;

import org.springframework.stereotype.Service;

public class DefaultGameService implements GameService{

    @Override
    public void startGame() {
        System.out.println("자, 게임을 시작하지");
    }
}
