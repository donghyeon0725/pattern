package com.design.pattern.objectAction.memento.before;

public class Game {
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
}
