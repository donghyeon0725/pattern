package com.design.pattern.objectStructure.proxy.example.bootApp;

import com.design.pattern.objectStructure.proxy.after.withInterface.GameService;
import org.springframework.stereotype.Service;

@Service
public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("자, 게임을 시작하지");
    }
}
