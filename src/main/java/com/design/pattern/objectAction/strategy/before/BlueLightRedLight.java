package com.design.pattern.objectAction.strategy.before;

public class BlueLightRedLight {
    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueRight() {
        if (speed == 1) {
            System.out.println("무 궁 화   꽆   이");
        } else if (speed == 2) {
            System.out.println("무궁화꽃이");
        } else if (speed == 3) {
            System.out.println("무궁홖이");
        }
    }

    public void redRight() {
        if (speed == 1) {
            System.out.println("피 었 습 니 다");
        } else if (speed == 2) {
            System.out.println("피었습니다.");
        } else if (speed == 3) {
            System.out.println("피었슴돠");
        }
    }
}
