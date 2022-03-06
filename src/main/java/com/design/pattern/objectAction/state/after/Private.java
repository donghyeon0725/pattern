package com.design.pattern.objectAction.state.after;

public class Private implements State {
    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addStudent(Student student) {
        if (student.isEnabledForPrivateClass(onlineCourse)) {
            this.onlineCourse.getStudents().add(student);
            return;
        }

        throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");
    }

    @Override
    public void addReview(Student student, String review) {
        if (this.onlineCourse.contain(student)) {
            this.onlineCourse.getReviews().add(review);
        }
    }
}
