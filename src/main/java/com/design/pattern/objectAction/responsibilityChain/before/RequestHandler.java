package com.design.pattern.objectAction.responsibilityChain.before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
