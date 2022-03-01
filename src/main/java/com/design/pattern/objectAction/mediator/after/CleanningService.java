package com.design.pattern.objectAction.mediator.after;

public class CleanningService {
    private FrontDesk frontDesk;

    public CleanningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTower(Integer guestId, int numberOfTower) {
        System.out.println(numberOfTower + " tower to " + guestId);
    }

    public void clean(Integer guestId) {
        System.out.println("clean room " + frontDesk.getRoomNumber(guestId));
    }
}
