package com.alekseysamoylov.questionnaire.test.controller;

import com.alekseysamoylov.questionnaire.entity.Company;
import com.alekseysamoylov.questionnaire.test.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test rest controller
 */
@RestController()
@RequestMapping("/rest")
public class TestRestController {

    private final TestService testService;

    @Autowired
    public TestRestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/get-company")
    public Company getCompany() {
        return testService.getCompany();
    }

}
