package com.design.pattern.objectCreate.builder.example;

import java.util.Objects;
import java.util.stream.Stream;

public class StreamExample {

    public static <T> T getName(T name) {
        return name;
    }


    public static void main(String[] args) {

        Stream.Builder<String> stringBuilder = Stream.builder();
        Stream<String> names = stringBuilder.add("1").add("2").build();
        names.forEach(System.out::println);


        // 단축형 (제네릭 메소드 String을 넘겨주면 생성되는 빌더의 제네릭 타입을 String으로 제한할 수 있다.)
        Stream<String> newNames = Stream.<String>builder().add("1").add("2").build();
        newNames.forEach(System.out::println);
    }
}
