package com.design.pattern.objectStructure.decorator.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book());

        try {
            List books = Collections.checkedList(list, Book.class);
            books.add(new Item());
        } catch (Exception e) {
            System.out.println("에러!");
            System.out.println(e.getMessage());
        }

        try {
            List unmodifiableList = Collections.unmodifiableList(list);
            unmodifiableList.add(new Book());
        } catch (Exception e) {
            System.out.println("에러!!");
            System.out.println(e.getMessage());
        }

//        HttpServletRequestWrapper
//        HttpServletResponseWrapper
    }
}
