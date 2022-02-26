package com.design.pattern.prototype.after;

import java.util.Objects;

public class GithubIssue implements Cloneable {

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return getId() == that.getId() && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getRepository(), that.getRepository());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getRepository());
    }
}
