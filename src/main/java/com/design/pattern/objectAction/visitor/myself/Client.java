
package com.design.pattern.objectAction.visitor.myself;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.printTo(new Phone());
    }
}
