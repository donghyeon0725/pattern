package com.design.pattern.objectStructure.proxy.example;

import com.design.pattern.objectStructure.proxy.after.GameServiceProxy;
import com.design.pattern.objectStructure.proxy.after.withInterface.DefaultGameService;
import com.design.pattern.objectStructure.proxy.after.withInterface.GameService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInJava {
    public static void main(String[] args) {

    }

    private void dynamicProxy() {
        GameService gameService = getGameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        // 프록시로 구현해야할 메소드가 여러개인 경우 귀찮기 때문에 메소드 앞뒤로 들어갈 로직이 같다면 사용할만한 방법
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        method.invoke(target, args);
                        return null;
                    }
                }
        );
    }
}
