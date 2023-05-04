package com.cry.luckytoyou.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fys
 * @date 2023/5/4
 * @description
 */
@Component
public class CountInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(Thread.currentThread().getName() + "执行前..." + this);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
