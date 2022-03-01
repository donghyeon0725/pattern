package com.design.pattern.objectAction.mediator.before;

public class Guest {
    private Restaurant restaurant = new Restaurant();

    private CleanningService cleanningService = new CleanningService();

    public void dinner() {
        restaurant.dinner(this);
    }

    public void getTower(int numberOfTower) {
        cleanningService.getTower(this, numberOfTower);
    }
}
