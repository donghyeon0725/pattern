package com.design.pattern.objectStructure.decorator.before;

public class SpamFilterCommentService extends CommentService {


    @Override
    public void addComment(String comment) {
        if (!isSpam(comment)) {
            super.addComment(comment);
        }
    }

    public boolean isSpam(String comment) {
        return comment.contains("http");
    }


}
