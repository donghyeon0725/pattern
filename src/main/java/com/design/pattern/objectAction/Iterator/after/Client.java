package com.design.pattern.objectAction.Iterator.after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("안녕하세요");
        board.addPost("i'm iron man");
        board.addPost("i like cheese burger");

        Iterator<Post> iterator = board.getPosts().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        Iterator<Post> recentSortedIterator = board.getRecentSortedPostIterator();

        while (recentSortedIterator.hasNext()) {
            System.out.println(recentSortedIterator.next().getTitle());
        }

    }
}
