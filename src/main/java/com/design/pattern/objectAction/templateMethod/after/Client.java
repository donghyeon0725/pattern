package com.design.pattern.objectAction.templateMethod.after;

import com.design.pattern.objectAction.templateMethod.before.FileProcessor;
import com.design.pattern.objectAction.templateMethod.before.MultiplyFileProcessor;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("file.txt");
        int result = fileProcessor.process();
        System.out.println(result);

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor("file.txt");
        int result1 = multiplyFileProcessor.process();
        System.out.println(result1);
    }
}
