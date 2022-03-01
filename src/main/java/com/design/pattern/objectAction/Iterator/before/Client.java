package com.design.pattern.objectAction.Iterator.before;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("안녕하세요");
        board.addPost("i'm iron man");
        board.addPost("i like cheese burger");

        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i=0; i<posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        Collections.sort(posts, (p1, p2) -> p2.getCreateDate().compareTo(p1.getCreateDate()));
        for (int i=0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

    }
}
