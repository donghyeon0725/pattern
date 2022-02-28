package com.design.pattern.objectAction.command.after;

public class GameCommand implements Command {

    private Game game;

    public GameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        game.end();
    }

}
