package com.design.pattern.objectAction.state.after;

public class Published implements State {
    private OnlineCourse onlineCourse;

    public Published(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);

        if (this.onlineCourse.getStudents().size() > 1) {
            this.onlineCourse.changeState(new Private(this.onlineCourse));
        }
    }

    @Override
    public void addReview(Student student, String review) {
        this.onlineCourse.getReviews().add(review);
    }
}
