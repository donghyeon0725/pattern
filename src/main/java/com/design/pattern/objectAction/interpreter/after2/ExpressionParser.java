package com.design.pattern.objectAction.interpreter.after2;

import java.util.Stack;

public class ExpressionParser {
    public static PostfixExpression parse(String s) {
        Stack<PostfixExpression> expressions = new Stack<>();

        PostfixExpression left, right;

        for (char c : s.toCharArray()) {
            switch (c) {
                case '+':
                    expressions.push(PostfixExpression.plus(expressions.pop(), expressions.pop()));
                    break;
                case '-':
                    left = expressions.pop();
                    right = expressions.pop();
                    expressions.push(PostfixExpression.minus(left, right));
                    break;
                case '*':
                    left = expressions.pop();
                    right = expressions.pop();
                    expressions.push(PostfixExpression.multiply(left, right));
                    break;
                case '/':
                    left = expressions.pop();
                    right = expressions.pop();
                    expressions.push(PostfixExpression.divide(left, right));
                    break;
                default:
                    expressions.push(PostfixExpression.variable(c));
                    break;
            }
        }

        return expressions.pop();
    }
}
