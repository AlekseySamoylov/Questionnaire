package com.alekseysamoylov.questionnaire.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(value = {"com.alekseysamoylov.questionnaire"})
public class MicroservicesBootApplication {
}
