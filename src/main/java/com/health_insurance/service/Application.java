package com.health_insurance.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.health_insurance")
public class Application {
    private static final Logger APPLICATION_LOG = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        APPLICATION_LOG.info("Business Application is about to run.");
        SpringApplication.run(Application.class, args);
    }

}