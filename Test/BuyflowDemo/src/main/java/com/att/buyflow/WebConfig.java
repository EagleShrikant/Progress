package com.att.buyflow;

import java.io.IOException;
import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.apache.velocity.runtime.RuntimeConstants;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig {

	@Bean
	public WebMvcConfigurerAdapter forwardToIndex() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/swagger").setViewName("redirect:/mvc/swagger/index.html");
			}
		};
	}
	
	/* Velocity Engine configuration */
	
	@Value("${spring.velocity.prefix}")
	private String vtplPrefix;
	
	@Bean
	@SuppressWarnings("deprecation")
	public VelocityEngine getVelocityEngine() throws VelocityException, IOException {

		org.springframework.ui.velocity.VelocityEngineFactory factory = new org.springframework.ui.velocity.VelocityEngineFactory();
		Properties props = new Properties();
		props.put(RuntimeConstants.RESOURCE_LOADER, "classpath");
		props.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		factory.setVelocityProperties(props);
		return factory.createVelocityEngine();
	}


	@Bean
	@SuppressWarnings("deprecation")
	public ViewResolver viewResolver() {
		 final org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver velocitybean = new org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver();
		velocitybean.setCache(true);
		velocitybean.setPrefix(vtplPrefix);
		velocitybean.setSuffix(".vm");
		velocitybean.setOrder(1);
		return velocitybean;
	}
	
}