package com.design.pattern.objectStructure.decorator.after;

public class SpamFilterCommentServiceDecorator implements CommentService {
    private CommentService commentService;

    public SpamFilterCommentServiceDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        if (!isSpam(comment)) {
            commentService.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }


}
