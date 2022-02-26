package com.design.pattern.objectStructure.adapter.before;

import java.util.Arrays;
import java.util.List;

public class AccountService {
    private List<Account> list = Arrays.asList(
            new Account("email1", "1234"),
            new Account("email2", "1234"),
            new Account("email3", "1234"),
            new Account("email4", "1234")
    );

    public Account findByEmail(String email) {

        for (Account accout : list) {
            if (email.equals(accout.getEmail()))
                return accout;
        }
        return null;
    }
}
