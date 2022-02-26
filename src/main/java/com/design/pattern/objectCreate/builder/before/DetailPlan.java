package com.design.pattern.objectCreate.builder.before;

public class DetailPlan {
    private int day;
    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }

    public int getDay() {
        return day;
    }

    public DetailPlan setDay(int day) {
        this.day = day;
        return this;
    }

    public String getPlan() {
        return plan;
    }

    public DetailPlan setPlan(String plan) {
        this.plan = plan;
        return this;
    }
}
