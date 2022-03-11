package com.design.pattern.objectAction.strategy.after;


public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Slow());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
