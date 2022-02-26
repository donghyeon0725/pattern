package com.design.pattern.objectCreate.prototype.after;

public class GithubRepository {

    private String user;

    private String name;

    public String getUser() {
        return user;
    }

    public GithubRepository setUser(String user) {
        this.user = user;
        return this;
    }

    public String getName() {
        return name;
    }

    public GithubRepository setName(String name) {
        this.name = name;
        return this;
    }
}
