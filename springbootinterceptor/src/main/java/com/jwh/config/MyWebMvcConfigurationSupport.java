package com.jwh.config;

import com.jwh.component.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: 渣渣灰
 * @Date: 2020/4/7 18:43
 * @Description:
 */
@Configuration
public class MyWebMvcConfigurationSupport implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/loginpage") ;
    }
}
