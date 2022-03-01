package com.design.pattern.objectAction.Iterator.after;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private LocalDateTime createDate;

    public Post(String title) {
        this.title = title;
        this.createDate = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public Post setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
        return this;
    }
}
