package com.design.pattern.objectStructure.adapter.after;

import com.design.pattern.objectStructure.adapter.after.security.UserDetails;
import com.design.pattern.objectStructure.adapter.after.security.UserDetailsService;

public class AccountServiceAdapter implements UserDetailsService {
    private AccountService accountService;

    public AccountServiceAdapter(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountAdapter(accountService.findByEmail(username));
    }
}
