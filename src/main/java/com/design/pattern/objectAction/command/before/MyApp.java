package com.design.pattern.objectAction.command.before;

public class MyApp {
    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        MyApp app = new MyApp(new Game());
        app.press();
    }
}
