package com.design.pattern.objectAction.responsibilityChain.after;

public class Client {
    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("게임을 시작하지!");
        requestHandler.handler(request);
    }

    public static void main(String[] args) {
        RequestHandler requestHandler = new AuthRequestHandler(new DefaultRequestHandler(null));
        Client client = new Client(requestHandler);
        client.doWork();
    }
}
