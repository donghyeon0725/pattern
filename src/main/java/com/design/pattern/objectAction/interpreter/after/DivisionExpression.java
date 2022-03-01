package com.design.pattern.objectAction.interpreter.after;

import java.util.Map;

public class DivisionExpression implements PostfixExpression {
    private PostfixExpression left, right;

    public DivisionExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return right.interpret(context) / left.interpret(context);
    }
}
