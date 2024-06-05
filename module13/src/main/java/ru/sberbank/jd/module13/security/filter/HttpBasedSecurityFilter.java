package ru.sberbank.jd.module13.security.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import ru.sberbank.jd.module13.security.model.LoginRolesAuthentication;
import ru.sberbank.jd.module13.security.model.Role;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class HttpBasedSecurityFilter extends GenericFilter {
    private static final String LOGIN_ID_HEADER = "X-Login-Id";
    private static final String ROLES_HEADER = "X-Roles";
    private static final String ROLES_DELIMITER = ",";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String login = ((HttpServletRequest) request).getHeader(LOGIN_ID_HEADER);
        Set<Role> roles = getRoles(request);

        LoginRolesAuthentication auth = new LoginRolesAuthentication(true, roles, login);
        SecurityContextHolder.getContext().setAuthentication(auth);

        chain.doFilter(request, response);
    }

    private Set<Role> getRoles(ServletRequest request) {
        String rolesString = ((HttpServletRequest) request).getHeader(ROLES_HEADER);
        return Arrays.stream(rolesString.split(ROLES_DELIMITER)).toList().stream().map(it -> Role.valueOf(it.trim())).collect(Collectors.toSet());
    }
}
