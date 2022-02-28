package com.design.pattern.objectAction.command.after;

import java.util.Stack;

public class MyApp {
    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.add(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop().undo();
        }
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.press(new ButtonCommand(new Button()));
        myApp.press(new GameCommand(new Game()));
        myApp.press(new LightCommand(new Light()));

        myApp.undo();
        myApp.undo();
        myApp.undo();
    }
}
