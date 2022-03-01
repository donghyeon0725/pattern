package com.design.pattern.objectAction.interpreter.after2;

import java.util.Map;

public class VariableExpression implements PostfixExpression {
    private Character character;

    public VariableExpression(Character character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(character);
    }
}
