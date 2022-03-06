package com.design.pattern.objectAction.state.after;

public class Draft implements State {

    private OnlineCourse onlineCourse;

    public Draft(OnlineCourse onlineCourse) {
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
        throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
    }
}
