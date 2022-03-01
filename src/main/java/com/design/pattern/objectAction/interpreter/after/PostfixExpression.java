package com.design.pattern.objectAction.interpreter.after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}
