package com.design.pattern.objectAction.mediator.before;

public class Restaurant {
    private CleanningService cleanningService = new CleanningService();

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }

    public void clean() {
        cleanningService.clean(this);
    }
}
