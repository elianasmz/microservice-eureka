package com.eureka.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurekaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // Esto le dice a Tomcat cómo encontrar tu aplicación Spring
        return application.sources(MicroserviceEurekaApplication.class);
    }
}
