package com.design.pattern.objectAction.templateMethod.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiplyFileProcessor extends AbstractFileProcessor {

    public MultiplyFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        result *= number;
        return result;
    }
}
