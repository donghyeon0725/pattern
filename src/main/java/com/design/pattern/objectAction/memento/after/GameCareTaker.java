package com.design.pattern.objectAction.memento.after;

import java.util.Stack;

public class GameCareTaker {
    private Stack<GameMemento> mementos = new Stack<>();

    public void saveGame(Game game) {
        mementos.push(game.createMemento());
    }

    public GameMemento getLastGameMemento() {
        return mementos.pop();
    }
}
