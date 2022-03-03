package com.design.pattern.objectAction.memento.after;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameCareTaker gameCareTaker = new GameCareTaker();
        gameCareTaker.saveGame(game);

        game.setRedTeamScore(999999999);
        game.setBlueTeamScore(999999999);

        game.restore(gameCareTaker.getLastGameMemento());

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
