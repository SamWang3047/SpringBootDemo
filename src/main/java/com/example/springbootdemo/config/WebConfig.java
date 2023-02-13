package com.example.springbootdemo.config;

import com.example.springbootdemo.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    //拦截器必须注册才能生效

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截地址来定位拦截器生效路径，也可以不添加以全局拦截
        //局部拦截，拦截/user所有的路径
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**");
        //全局拦截
        //registry.addInterceptor(new LoginInterceptor());
    }
}
