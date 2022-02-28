package com.design.pattern.objectAction.responsibilityChain.before;

public class Request {
    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
