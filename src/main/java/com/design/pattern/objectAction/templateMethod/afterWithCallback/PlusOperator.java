package com.design.pattern.objectAction.templateMethod.afterWithCallback;

public class PlusOperator implements Operator {
    @Override
    public int getResult(int left, int right) {
        return left + right;
    }
}
