package com.design.pattern.objectAction.mediator.after;


public class FrontDesk {
    private Restaurant restaurant = new Restaurant();

    private CleanningService cleanningService = new CleanningService(this);

    public String getRoomNumber(Integer guestId) {
        return "room_" + guestId;
    }

    public void dinner(Guest guest) {
        restaurant.dinner(guest.getId());
    }

    public void getTower(Guest guest, int numberOfTower) {
        cleanningService.getTower(guest.getId(), numberOfTower);
    }

    public void cleanRoom(Guest guest) {
        cleanningService.clean(guest.getId());
    }
}
