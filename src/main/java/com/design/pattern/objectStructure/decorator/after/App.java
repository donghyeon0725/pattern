package com.design.pattern.objectStructure.decorator.after;

public class App {
    private static boolean spamFlag = true;

    private static boolean trimFlag = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (spamFlag) {
            commentService = new SpamFilterCommentServiceDecorator(commentService);
        }

        if (trimFlag) {
            commentService = new TrimCommentServiceDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("이 글의 일부는 곧 제거될 것 입니다...");
        client.writeComment("http://localhost");
    }
}
