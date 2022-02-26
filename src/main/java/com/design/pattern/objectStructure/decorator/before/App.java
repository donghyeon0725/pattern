package com.design.pattern.objectStructure.decorator.before;

public class App {
    public static void main(String[] args) {
        Client client1 = new Client(new CommentService());
        client1.writeComment("이 글의 일부는 곧 제거될 것 입니다...");
        client1.writeComment("http://localhost");
        // 이 글의 일부는 곧 제거될 것 입니다...
        // http://localhost


        Client client2 = new Client(new TrimCommentService());
        client2.writeComment("이 글의 일부는 곧 제거될 것 입니다...");
        client2.writeComment("http://localhost");
        // 이 글의 일부는 곧 제거될 것 입니다
        // http://localhost

        Client client3 = new Client(new SpamFilterCommentService());
        client3.writeComment("이 글의 일부는 곧 제거될 것 입니다...");
        client3.writeComment("http://localhost");
        // 이 글의 일부는 곧 제거될 것 입니다...

    }
}
