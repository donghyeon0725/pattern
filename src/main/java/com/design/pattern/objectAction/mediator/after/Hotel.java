package com.design.pattern.objectAction.mediator.after;


public class Hotel {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        Guest guest = new Guest(frontDesk, 1);
        guest.getTower(3);
        guest.dinner();
        guest.cleanRoom();
    }
}
