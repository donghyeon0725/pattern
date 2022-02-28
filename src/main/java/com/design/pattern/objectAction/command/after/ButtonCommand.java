package com.design.pattern.objectAction.command.after;


public class ButtonCommand implements Command {
    private Button button;

    public ButtonCommand(Button button) {
        this.button = button;
    }

    @Override
    public void execute() {
        button.press();
    }

    @Override
    public void undo() {
        button.unpress();
    }
}
