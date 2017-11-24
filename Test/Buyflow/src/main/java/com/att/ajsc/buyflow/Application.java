package com.att.ajsc.buyflow;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.Servlet;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.att.ajsc.common.utility.SystemPropertiesLoader;

@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@ImportResource("classpath:applicationContext.xml")
public class Application {
	private static final String CAMEL_SERVLET_NAME = "CamelServlet";
	private static final String CAMEL_URL_MAPPING = "/*";
	

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) throws Exception {
		SystemPropertiesLoader.addSystemProperties();
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		ServletRegistrationBean registration = new ServletRegistrationBean();
		registration.setName(CAMEL_SERVLET_NAME);
		registration.setServlet((Servlet) new CamelHttpTransportServlet());
		Collection<String> urlMappings = new ArrayList<String>();
		urlMappings.add(CAMEL_URL_MAPPING);
		registration.setUrlMappings(urlMappings);
		return registration;
	}

	@Bean
	public Client restClient() {
		return ClientBuilder.newClient();
	}
}
