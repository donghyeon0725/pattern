package com.design.pattern.objectStructure.bridge.after;

public class App {
    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KDA());
        kdaAri.skillQ();

        Champion poolPartyAri = new Ari(new PoolParty());
        poolPartyAri.skillW();



    }
}
