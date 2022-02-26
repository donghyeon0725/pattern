package com.design.pattern.objectStructure.adapter.after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
