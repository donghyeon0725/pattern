package com.design.pattern.objectAction.state.after;

public interface State {
    void addStudent(Student student);

    void addReview(Student student, String review);
}
