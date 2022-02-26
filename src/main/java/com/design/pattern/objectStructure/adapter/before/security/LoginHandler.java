package com.design.pattern.objectStructure.adapter.before.security;

public class LoginHandler {
    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);

        if (!userDetails.getPassword().equals(password)) {
            throw new IllegalArgumentException();
        }

        return userDetails.getUsername();
    }
}
