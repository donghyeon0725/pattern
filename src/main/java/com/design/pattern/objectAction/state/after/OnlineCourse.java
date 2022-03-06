package com.design.pattern.objectAction.state.after;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private State state = new Draft(this);

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public void addReview(String review, Student student) {
        this.state.addReview(student, review);
    }

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public State getState() {
        return state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

    protected boolean contain(Student student) {
        return this.students.contains(student);
    }

}
