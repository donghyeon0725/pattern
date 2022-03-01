package com.design.pattern.objectAction.mediator.before;

public class Gym {
    private CleanningService cleanningService = new CleanningService();

    public void clean() {
        cleanningService.clean(this);
    }
}
