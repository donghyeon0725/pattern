package com.design.pattern.objectAction.strategy.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyInJava {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5);

        System.out.println(numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(numbers);

        Collections.sort(numbers, Comparator.naturalOrder());
    }
}
