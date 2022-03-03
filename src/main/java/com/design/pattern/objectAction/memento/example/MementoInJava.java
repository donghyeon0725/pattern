package com.design.pattern.objectAction.memento.example;

import com.design.pattern.objectAction.memento.after.Game;

import java.io.*;

public class MementoInJava {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        try (
                FileOutputStream fileOut = new FileOutputStream("GameSave.hex");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
        ) {
            out.writeObject(game);
        }

        game.setRedTeamScore(99999);
        game.setBlueTeamScore(99999);

        try (
                FileInputStream fileInput = new FileInputStream("GameSave.hex");
                ObjectInputStream input = new ObjectInputStream(fileInput);
        ) {
            game = (Game)input.readObject();
        }

        System.out.println(game.getRedTeamScore());
        System.out.println(game.getBlueTeamScore());
    }
}
