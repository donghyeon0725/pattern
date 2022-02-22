package com.design.pattern.builder.after;

import java.time.LocalDate;

public interface TourPlanBuilder {
    // 스스로의 객체를 다시 반환해서 이 코드를 클라이언트는 끊김없이 사용할 수 있음
    TourPlanBuilder title(String title);
    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);
    TourPlanBuilder whereToStay(String whereToStay);
    TourPlanBuilder addPlan(int day, String plan);

    // 최종적으로 값의 검증을 할 수 있는 곳
    TourPlan getPlan() throws IllegalAccessException;
}
