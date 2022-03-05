package com.design.pattern.objectAction.observer.example;

import java.util.concurrent.*;

public class ObserverInJava3 {
    public static void main(String[] args) throws InterruptedException {
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
                // 구독을 수행합니다.
                System.out.println("구독");
                // Subscription 를 등록합니다.
                this.subscription = subscription;
                // 1개의 데이터를 요청합니다.
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                // Subscriber 가 데이터를 받으면 next 가 호출됩니다.
                System.out.println("onNext call");
                System.out.println(item);
                // 다음 메세지를 호출할 수 있는 상태인지 Subscription 을 통해서 Publisher 에게 알립니다.
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
        ((SubmissionPublisher)publisher).submit("submit1");
        ((SubmissionPublisher)publisher).submit("submit2");
        ((SubmissionPublisher)publisher).submit("submit3");
        ((SubmissionPublisher)publisher).submit("submit4");
        ((SubmissionPublisher)publisher).close();
        System.out.println("끝");

    }
}
