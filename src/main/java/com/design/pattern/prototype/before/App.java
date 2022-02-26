package com.design.pattern.prototype.before;

public class App {
    public static void main(String[] args) {
        // Github 에서 받아온 객체라고 가정 (GithubIssue 내부에 있다고 가정)
        GithubRepository repository = new GithubRepository();

        repository.setName("whiteship");
        repository.setName("live-study");


        GithubIssue githubIssue1 = new GithubIssue(repository);
        githubIssue1.setId(1);
        githubIssue1.setTitle("1주차 과제 : ....");

        System.out.println(githubIssue1.getUrl());

//        // 기존에 있던 repository 인스턴스를 다시 받아오는게 아니라 prototype으로 복제해서 사용하고 싶은 것임
//        GithubIssue githubIssue2 = githubIssue1.clone();
//        githubIssue2.setId(2);
//        githubIssue2.setTitle("2주차 과제 : ...");
    }
}
