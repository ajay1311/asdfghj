package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.spring.model.Contact;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
    	
    	Class<?>[] classes = {MvcConfiguration.class}; 
        return classes;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
