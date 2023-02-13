package com.example.springbootdemo.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    //拦截器通过重写preHandle、postHandel和afterCompletion来实现不同时间段的功能
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor");
        //默认返回是true，如果改为false将会拦截后续操作
        return true;
    }
}
