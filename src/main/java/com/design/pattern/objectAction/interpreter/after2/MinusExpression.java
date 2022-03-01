package com.design.pattern.objectAction.interpreter.after2;

import java.util.Map;

public class MinusExpression implements PostfixExpression {
    private PostfixExpression left, right;

    public MinusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return right.interpret(context) - left.interpret(context);
    }
}
