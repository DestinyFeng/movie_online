package com.woniu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/logo/**").addResourceLocations("file:/c:/logo/");
        registry.addResourceHandler("/pic/**").addResourceLocations("file:/c:/pic/");
    }
}
