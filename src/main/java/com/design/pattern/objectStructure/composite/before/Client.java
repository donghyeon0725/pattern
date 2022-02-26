package com.design.pattern.objectStructure.composite.before;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        // 클라이언트는 item 하나던 여러개가 담긴 Bag 이던 동일한 코드로 동작을 시키고 싶음
        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);

    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }
}
