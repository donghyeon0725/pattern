package com.design.pattern.objectAction.observer.example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;
import java.util.Observer;

public class ObserverInJava {

    static class User implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println(arg);
        }
    }

    static class Subject extends Observable {
        public void add (String message) {
            // setChanged 로 상태가 변경되었다는 것을 설정해줘야만 옵저버가 알림을 받을 수 있음
            // 알림을 받는 순서를 정할 수 없음
            setChanged();
            notifyObservers(message);
            setChanged();
            notifyObservers(message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User user = new User();
        subject.addObserver(user);
        subject.add("Hello Java, Observer");

//        PropertyChangeListener; // observer
//        PropertyChangeSupport;; // subject
    }
}
