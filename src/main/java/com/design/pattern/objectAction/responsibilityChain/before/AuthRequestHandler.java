package com.design.pattern.objectAction.responsibilityChain.before;

public class AuthRequestHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("인증 처리");
        super.handler(request);
    }
}
