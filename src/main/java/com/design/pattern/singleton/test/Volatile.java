package com.design.pattern.singleton.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Volatile {

    private static int count = 0;

    private static volatile int volatileCount = 0;

    private static class Tester implements Runnable {

        @Override
        public void run() {
            for (int i=0; i<1000; i++) {
                Volatile.count++;
            }
        }
    }

    private static class VolatileTester implements Runnable {

        @Override
        public void run() {
            for (int i=0; i<1000; i++) {
                Volatile.volatileCount++;
            }
        }
    }

    public static void main(String[] args) {
        // volatile 키워드를 사용하지 않았을 때
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.execute(new Tester());
        es.execute(new Tester());

        es.shutdown();

        try {
            es.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count result => " + Volatile.count);
        // 1932

        // volatile 키워드를 사용했을 때
        ExecutorService eess = Executors.newFixedThreadPool(2);

        eess.execute(new VolatileTester());
        eess.execute(new VolatileTester());

        eess.shutdown();

        try {
            eess.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("volatileCount result => " + Volatile.volatileCount);
        // 2000
    }



}
