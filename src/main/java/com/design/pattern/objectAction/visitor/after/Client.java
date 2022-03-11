package com.design.pattern.objectAction.visitor.after;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.accept(new Phone());
    }
}
