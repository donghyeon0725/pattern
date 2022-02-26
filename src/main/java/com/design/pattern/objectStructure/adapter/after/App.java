package com.design.pattern.objectStructure.adapter.after;

import com.design.pattern.objectStructure.adapter.after.security.LoginHandler;
import com.design.pattern.objectStructure.adapter.after.security.UserDetails;
import com.design.pattern.objectStructure.adapter.after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountServiceAdapter(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String email = loginHandler.login("email1", "1234");
        System.out.println(email);
    }
}
