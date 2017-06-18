package com.alekseysamoylov.questionnaire.test.services;

import com.alekseysamoylov.questionnaire.entity.Company;
import com.alekseysamoylov.questionnaire.entity.Question;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Test service
 */
@Service
public class TestService {

    public String hello() {
        return "Hello world!";
    }

    public Company getCompany() {
        Company company = new Company();
        company.setId(1L);

        Question question = new Question();
        question.setId(1L);
        question.setEMail("test1@mail");
        question.setText("Hello1");
        question.setRate(3);

        Question question2 = new Question();
        question2.setId(2L);
        question2.setEMail("test2@mail");
        question2.setText("Hello2");
        question2.setRate(5);

        company.getInfoList().addAll(Arrays.asList(question, question2));

        return company;
    }
}
