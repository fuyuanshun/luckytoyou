package com.cry.luckytoyou.config;

import com.cry.luckytoyou.interceptor.CountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author fys
 * @date 2023/5/4
 * @description
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Autowired
    private CountInterceptor countInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(countInterceptor).addPathPatterns("/**");
    }
}
