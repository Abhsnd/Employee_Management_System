package com.kuangshen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    // 视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 首页
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        // 其他页面
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    // 自定义的国际化组件
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

    // 添加自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())  // 增加拦截器
                .addPathPatterns("/**")     // 拦截范围
                .excludePathPatterns("/index.html", "/", "/user/login", "/css/**", "/js/**", "/image/**");  // 拦截器放行范围
    }
}
