package com.design.pattern.objectAction.Iterator.example;

import com.design.pattern.objectAction.Iterator.after.Board;
import com.design.pattern.objectAction.Iterator.after.Post;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorInJava {
    public static void main(String[] args) {
        Enumeration enumeration;
        Iterator iterator;

        Board board = new Board();
        board.addPost("title1");
        board.addPost("title2");
        board.addPost("title3");

        // 리턴 없이 반복만 할 때 사용할 수 있는 메소드
        board.getPosts().iterator().forEachRemaining(new Consumer<Post>() {
            @Override
            public void accept(Post post) {
                System.out.println(post.getTitle());
            }
        });

        board.getPosts().iterator().forEachRemaining(post -> System.out.println(post.getTitle()));
    }
}
