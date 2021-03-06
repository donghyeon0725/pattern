package com.design.pattern.objectCreate.builder.after;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        TourPlanBuilder builder = new DefaultTourBuilder();
        builder.title("제주")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();


    }
}
