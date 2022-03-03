package com.design.pattern.objectAction.memento.after;

public final class GameMemento {
    private int blueTeamScore;
    private int redTeamScore;

    public GameMemento(int blueTeamScore, int redTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }
}
