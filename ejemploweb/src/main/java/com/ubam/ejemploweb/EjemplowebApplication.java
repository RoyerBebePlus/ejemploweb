package com.ubam.ejemploweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EjemplowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemplowebApplication.class, args);
	}
	@Bean
    public ServletRegistrationBean<MiServlet1> servletRegistrationBean() {
        return new ServletRegistrationBean<>(new MiServlet1(), "/miservlet1/*");
    }
}
