package com.design.pattern.objectCreate.prototype.before;

public class GithubIssue {

    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public GithubIssue setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GithubIssue setTitle(String title) {
        this.title = title;
        return this;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public GithubIssue setRepository(GithubRepository repository) {
        this.repository = repository;
        return this;
    }

    public String getUrl() {
        return "https://github.com/" + repository.getUser() + "/" + repository.getName() + "/" + id;
    }
}
