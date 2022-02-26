package com.design.pattern.prototype.example;


import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");


        // 방법 1
        ArrayList<String> newArrayList = (ArrayList<String>) arrayList.clone();
        System.out.println(arrayList.get(0) == newArrayList.get(0));

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        List<String> newList = new ArrayList<>(list);
        System.out.println(list.get(0) == newList.get(0));

    }
}
