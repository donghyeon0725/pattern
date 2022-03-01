package com.design.pattern.objectAction.interpreter.after2;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);

    // interface 의 static 를 통해서 구현체를 넘기고 있다.
    // 인터페이스에 static 메소드를 정의하는 것은 한 클래스에 그것을 정의하는 것과 동일합니다.
    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {

//        return new PostfixExpression() {
//            @Override
//            public int interpret(Map<Character, Integer> context) {
//                return right.interpret(context) + left.interpret(context);
//            }
//        };

        // 위와 동일하다.
        return (context) -> right.interpret(context) + left.interpret(context);
    }

    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return (context) -> right.interpret(context) - left.interpret(context);
    }

    static PostfixExpression divide(PostfixExpression left, PostfixExpression right) {
        return (context) ->  right.interpret(context) / left.interpret(context);
    }

    static PostfixExpression multiply(PostfixExpression left, PostfixExpression right) {
        return (context) -> right.interpret(context) * left.interpret(context);
    }

    static PostfixExpression variable(Character c) {
        return (context) -> context.get(c);
    }
}
