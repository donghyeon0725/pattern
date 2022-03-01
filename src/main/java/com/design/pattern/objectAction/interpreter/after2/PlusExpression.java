package com.design.pattern.objectAction.interpreter.after2;

import java.util.Map;

public class PlusExpression implements PostfixExpression {
    private PostfixExpression left, right;

    public PlusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return right.interpret(context) + left.interpret(context);
    }
}
