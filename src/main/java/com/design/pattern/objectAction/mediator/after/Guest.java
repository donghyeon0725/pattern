package com.design.pattern.objectAction.mediator.after;

public class Guest {

    private FrontDesk frontDesk;

    private Integer id;

    public Guest(FrontDesk frontDesk, Integer id) {
        this.frontDesk = frontDesk;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void dinner() {
        frontDesk.dinner(this);
    }

    public void getTower(int numberOfTower) {
        frontDesk.getTower(this, numberOfTower);
    }

    public void cleanRoom() {
        frontDesk.cleanRoom(this);
    }

}
