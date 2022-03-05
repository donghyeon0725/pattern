package com.design.pattern.objectAction.observer.example.springSample2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @EventListener(Event.class)
    public void onApplicationEvent(Event event) {
        System.out.println(event.getMessage());
    }
}
