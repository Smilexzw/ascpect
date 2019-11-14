package com.jd.ascpect.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * SpringMvc 配置
 * @author xuzhangwang
 * @date 2019/11/12 10:40
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 静态资源加载配置
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
