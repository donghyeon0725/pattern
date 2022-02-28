package com.design.pattern.objectAction.responsibilityChain.after;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("인증 처리");
        super.handler(request);
    }
}
