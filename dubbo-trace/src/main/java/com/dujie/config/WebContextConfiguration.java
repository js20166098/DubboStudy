package com.dujie.config;

import com.dujie.interceptor.TraceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class WebContextConfiguration extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(buildTraceInter()).addPathPatterns("/**").order(0);
    }

    @Bean
    public TraceInterceptor buildTraceInter() {
        return new TraceInterceptor();
    }
}