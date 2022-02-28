package com.design.pattern.objectStructure.flyweight.example;

public class IntegerExample {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(12);
        Integer int2 = Integer.valueOf(12);
        System.out.println(int1 == int2);

        Integer int3 = Integer.valueOf(1222);
        Integer int4 = Integer.valueOf(1222);
        System.out.println(int3 == int4);

        Integer int5 = 12;
        Integer int6 = 12;
        System.out.println(int5 == int6);
    }
}
