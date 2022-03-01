package com.design.pattern.objectAction.interpreter.before;

import org.springframework.security.core.parameters.P;

import java.util.Stack;

public class PostfixNotation {
    private final String expression;

    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        int left, right;

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    right = numbers.pop();
                    left = numbers.pop();
                    numbers.push(left - right);
                    break;
                case '*':
                    right = numbers.pop();
                    left = numbers.pop();
                    numbers.push(left * right);
                    break;
                case '/':
                    right = numbers.pop();
                    left = numbers.pop();
                    numbers.push(left / right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }

        System.out.println(numbers.pop());
    }

    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-4+");
        PostfixNotation newPostfixNotation = new PostfixNotation("123*+42+2/+");
        postfixNotation.calculate();
        newPostfixNotation.calculate();
    }
}
