package com.design.pattern.objectStructure.bridge.before;

public class PoolPartyKaisa implements Champion {
    @Override
    public void move() {
        System.out.println("KDA ari move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA ari skill q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA ari skill w");
    }

    @Override
    public void skillE() {
        System.out.println("KDA ari skill e");
    }

    @Override
    public void skillR() {
        System.out.println("KDA ari skill r");
    }
}
