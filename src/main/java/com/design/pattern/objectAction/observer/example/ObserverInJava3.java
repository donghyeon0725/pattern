package com.design.pattern.objectAction.observer.example;

import java.util.concurrent.*;

public class ObserverInJava3 {
    public static void main(String[] args) {
//        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
//            @Override
//            public void subscribe(Flow.Subscriber<? super String> subscriber) {
//                subscriber.onNext("hello flow");
//                subscriber.onComplete();
//            }
//        };

        Flow.Publisher<String> publisher = new SubmissionPublisher<>();

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("구독");
                this.subscription = subscription;
                subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext call");
                System.out.println(item);
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);
        ((SubmissionPublisher)publisher).submit("submit");
        ((SubmissionPublisher)publisher).submit("submit");
        ((SubmissionPublisher)publisher).submit("submit");
        ((SubmissionPublisher)publisher).submit("submit");
        System.out.println("출력 끝");

    }
}
