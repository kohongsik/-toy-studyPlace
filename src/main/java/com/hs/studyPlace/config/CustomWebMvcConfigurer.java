package com.hs.studyPlace.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HttpRequestInteceptor());

        WebMvcConfigurer.super.addInterceptors(registry);
    }
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry
                .addMapping("/**")
                .allowedOrigins("http://localhost:9090")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .maxAge(3000);
    }
}
