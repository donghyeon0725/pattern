package com.design.pattern.builder.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourPlan {
    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans = new ArrayList<>();

    public TourPlan() {
    }

    public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetailPlan> plans) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }


    public String getTitle() {
        return title;
    }

    public TourPlan setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getNights() {
        return nights;
    }

    public TourPlan setNights(int nights) {
        this.nights = nights;
        return this;
    }

    public int getDays() {
        return days;
    }

    public TourPlan setDays(int days) {
        this.days = days;
        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public TourPlan setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getWhereToStay() {
        return whereToStay;
    }

    public TourPlan setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    public List<DetailPlan> getPlans() {
        return plans;
    }

    public TourPlan addPlans(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
        return this;
    }
}
