package ru.sberbank.jd.module13.security.model;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public enum Role implements GrantedAuthority {
// PRIVILEGES
//        READ,
//    DELETE,
//    CLIENT_READ,
//    WRITE;

    //ROLES
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER"),
    VIEWER("ROLE_VIEWER");

    private final String value;

    @Override
    public String getAuthority() {
        return value;
    }
}
