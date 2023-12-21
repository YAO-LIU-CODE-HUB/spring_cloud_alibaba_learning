package org.example.filter;

import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * BasicAuthecationFilter:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/21
 * @version: 1.0.0
 */
@Component
@WebFilter(urlPatterns = "/user/*", filterName = "basicAuthecationFilter")
public class BasicAuthecationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authorization = httpServletRequest.getHeader("Authorization");
        if (StringUtils.isEmpty(authorization)) {
            httpServletResponse.setStatus(401);
            httpServletResponse.getWriter().write("need login");
            return;
        }
        System.out.println("你好："+ authorization);
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
