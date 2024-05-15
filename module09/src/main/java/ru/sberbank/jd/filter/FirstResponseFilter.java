package ru.sberbank.jd.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(filterName = "FirstResponseFilter", servletNames = {"FirstServlet"})
public class FirstResponseFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.addHeader("response-filter-x", "my value");

        System.out.println("FirstResponseFilter added header");

        chain.doFilter(request, response);
    }
}
