package com.design.pattern.objectAction.memento.after;

import java.io.Serializable;

public class Game implements Serializable  {
    private int blueTeamScore;
    private int redTeamScore;

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public Game setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
        return this;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public Game setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
        return this;
    }


    public GameMemento createMemento() {
        return new GameMemento(this.blueTeamScore, this.redTeamScore);
    }

    public void restore(GameMemento memento) {
        this.blueTeamScore = memento.getBlueTeamScore();
        this.redTeamScore = memento.getRedTeamScore();
    }

}
