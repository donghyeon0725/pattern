package com.design.pattern.objectAction.Iterator.after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> posts;

    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreateDate().compareTo(p1.getCreateDate()));
        this.posts = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return posts.hasNext();
    }

    @Override
    public Post next() {
        return posts.next();
    }
}
