package com.design.pattern.objectAction.mediator.before;

public class CleanningService {
    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + " to guest " + guest);
    }

    public void clean(Gym gym) {
        System.out.println("clean " + gym);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("clean "  + restaurant);
    }
}
