package org.example.filter;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * RateLimitFilter:
 *
 * @author: 刘瑶
 * @description:
 * @date: 2023/12/21
 * @version: 1.0.0
 */
@Component
@WebFilter(urlPatterns = "/user/*", filterName = "rateLimitFilter")
public class RateLimitFilter extends OncePerRequestFilter {
    private RateLimiter rateLimiter = RateLimiter.create(60);
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        if (rateLimiter.tryAcquire(100)) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
        } else {
            httpServletResponse.setStatus(429);
            httpServletResponse.getWriter().write("too many request");
        }
    }
}
