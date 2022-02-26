package com.design.pattern.objectStructure.decorator.after;

import javax.xml.stream.events.Comment;

public class TrimCommentServiceDecorator implements CommentService {
    private CommentService commentService;

    public TrimCommentServiceDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
