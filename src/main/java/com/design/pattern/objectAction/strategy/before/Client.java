package com.design.pattern.objectAction.strategy.before;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(3);
        blueLightRedLight.blueRight();
        blueLightRedLight.redRight();
    }
}
