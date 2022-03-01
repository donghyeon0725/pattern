package com.design.pattern.objectAction.interpreter.after;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        PostfixExpression expression = ExpressionParser.parse("abc-+");
        Map<Character, Integer> context = Map.of('a', 1, 'b', 2, 'c', 3);
        int result = expression.interpret(context);
        System.out.println(result);
    }
}
