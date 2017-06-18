package com.alekseysamoylov.questionnaire.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.alekseysamoylov.questionnaire"})
public class MicroservicesBootApplication extends SpringBootServletInitializer {


    /**
     * Used when run as a JAR
     */
    public static void main(String[] args) {
        SpringApplication.run(MicroservicesBootApplication.class);
    }

    /**
     * Used when run as WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroservicesBootApplication.class);
    }
}
