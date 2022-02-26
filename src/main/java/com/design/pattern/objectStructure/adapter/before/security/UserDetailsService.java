package com.design.pattern.objectStructure.adapter.before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
