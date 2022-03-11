package com.design.pattern.objectAction.templateMethod.afterWithCallback;


public class Client {
    public static void main(String[] args) {
        AbstractFileProcessor fileProcessor = new AbstractFileProcessor("file.txt");
        int process = fileProcessor.process(new PlusOperator());
        System.out.println(process);
    }
}
