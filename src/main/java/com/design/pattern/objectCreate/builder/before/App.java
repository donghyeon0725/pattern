package com.design.pattern.objectCreate.builder.before;

import java.time.LocalDate;

/**
 * 클라이언트 코드에 해당
 * */
public class App {
    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");


        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("제주");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlans(0, "체크인 이후 짐풀기");
        tourPlan.addPlans(0, "저녁 식사");
        tourPlan.addPlans(1, "조식 부페에서 식사");
        tourPlan.addPlans(1, "해변가 산책");
        tourPlan.addPlans(2, "리조트 수영장에서 놀기");
        tourPlan.addPlans(2, "체크아웃");


    }
}
