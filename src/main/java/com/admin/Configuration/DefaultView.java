package com.admin.Configuration;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhenyang.he on 2017/10/25.
 */
public class DefaultView extends WebMvcConfigurerAdapter {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/login").setViewName("forward:/index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
