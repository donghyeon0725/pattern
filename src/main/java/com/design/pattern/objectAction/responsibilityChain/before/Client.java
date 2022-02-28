package com.design.pattern.objectAction.responsibilityChain.before;

public class Client {

    public static void main(String[] args) {
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.handler(new Request("일을 시작합니다"));

        System.out.println("========");
        RequestHandler authRequestHandler = new AuthRequestHandler();
        authRequestHandler.handler(new Request("일을 시작합니다"));

        // 새로운 기능이 필요하면 그 때는 어떻게?

    }
}
