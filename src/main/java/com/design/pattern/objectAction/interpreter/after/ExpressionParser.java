package com.design.pattern.objectAction.interpreter.after;

import java.util.Stack;

public class ExpressionParser {
    public static PostfixExpression parse(String s) {
        Stack<PostfixExpression> expressions = new Stack<>();

        PostfixExpression left, right;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '+':
                    expressions.push(new PlusExpression(expressions.pop(), expressions.pop()));
                    break;
                case '-':
                    left = expressions.pop();
                    right = expressions.pop();
                    expressions.push(new MinusExpression(left, right));
                    break;
                case '*':
                    left = expressions.pop();
                    right = expressions.pop();
                    expressions.push(new MultilplyExpression(left, right));
                    break;
                case '/':
                    left = expressions.pop();
                    right = expressions.pop();
                    expressions.push(new DivisionExpression(left, right));
                    break;
                default:
                    expressions.push(new VariableExpression(c));
                    break;
            }
        }

        return expressions.pop();
    }
}
