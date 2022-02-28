package com.design.pattern.objectAction.responsibilityChain.after;

public class DefaultRequestHandler extends RequestHandler {

    public DefaultRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println(request.getBody());
        super.handler(request);
    }
}
