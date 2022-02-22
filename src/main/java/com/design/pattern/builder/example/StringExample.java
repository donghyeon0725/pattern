package com.design.pattern.builder.example;

public class StringExample {
    public static void main(String[] args) {
        // StringBuffer 도 동인한 디자인 패턴
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("1").append("2").toString();
        System.out.println(result);
    }
}
