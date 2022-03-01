package com.design.pattern.objectAction.interpreter.after;

import java.util.Map;

public class MultilplyExpression implements PostfixExpression {
    private PostfixExpression left, right;

    public MultilplyExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return right.interpret(context) + left.interpret(context);
    }
}
