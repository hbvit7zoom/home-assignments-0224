package ru.sberbank.jd.module13.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sberbank.jd.module13.security.model.Role;

import java.util.Set;

@RestController
@Slf4j
public class HelloWorldController {

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/roles")
    public String getRoles() {
        Set<Role> roles = (Set<Role>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        return "GET " + roles.toString();
    }

    @PreAuthorize("hasRole('ADMIN') or hasPermission()")
//    @PostAuthorize("returnObject == 'POST [ADMIN]'")
    @PostMapping("/roles")
    public String updateRoles() {
        Set<Role> roles = (Set<Role>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        return "POST " + roles.toString();
    }

    @PostAuthorize("returnObject == '/user/{id} = ' + #id")
    @GetMapping("/user/{id}")
    public String getAdminInfo(@PathVariable String id) {
        return "/user/{id} = " + id;
//        return "GET " + id;
    }


}
