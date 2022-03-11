package com.design.pattern.objectAction.templateMethod.after;

public class PlusFileProcessor extends AbstractFileProcessor {

    public PlusFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        result += number;
        return result;
    }
}
