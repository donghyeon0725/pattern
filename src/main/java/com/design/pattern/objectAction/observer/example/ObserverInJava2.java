package com.design.pattern.objectAction.observer.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ObserverInJava2 {
    static class User implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println(evt.getNewValue());
        }
    }

    static class Subject {
        PropertyChangeSupport support = new PropertyChangeSupport(this);

        // addPropertyChangeListener 는 이름을 받을 수도 있는데 관심사 분리를 위한 것이다.
        public void addObserver(PropertyChangeListener observer) {
            support.addPropertyChangeListener(observer);
        }

        public void removeObserver(PropertyChangeListener observer) {
            support.removePropertyChangeListener(observer);
        }

        // propertyName 을 가지고 해당 관심사에 해당하는 옵저버만 일하도록 할 수 있음
        public void add(String message) {
            support.firePropertyChange("eventName", null, message);
//            fireIndexedPropertyChange 를 통해서 우선순위를 줄수도 있음
//            support.fireIndexedPropertyChange("eventName", 1, null, message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User observer = new User();
        subject.addObserver(observer);
        subject.add("자바 예제 코드");
        subject.removeObserver(observer);
        subject.add("이 메세지는 볼 수가 없슴");
    }
}
