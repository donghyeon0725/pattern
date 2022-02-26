package com.design.pattern.prototype.after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();

        repository.setUser("whiteship");
        repository.setName("live-study");


        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : ....");

        System.out.println(githubIssue.getUrl());

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.equals(githubIssue));
        clone.setId(2);
        clone.setTitle("2주차 과제 : ...");
        System.out.println(clone.getUrl());


        System.out.println("after new setting");
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
    }
}
