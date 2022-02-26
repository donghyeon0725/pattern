package com.design.pattern.objectStructure.adapter.after;

import com.design.pattern.objectStructure.adapter.after.security.UserDetails;

public class AccountAdapter implements UserDetails {

    private Account account;

    public AccountAdapter(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getEmail();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
