package com.design.pattern.objectAction.responsibilityChain.after;

public abstract class RequestHandler {
    private RequestHandler nextRequestHandler;

    public RequestHandler(RequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

    public void handler(Request request) {
        if (nextRequestHandler != null) {
            nextRequestHandler.handler(request);
        }
    }
}
