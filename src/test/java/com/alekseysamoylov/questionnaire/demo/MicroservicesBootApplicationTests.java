package com.alekseysamoylov.questionnaire.demo;


import com.alekseysamoylov.questionnaire.services.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MicroservicesBootApplication.class)
public class MicroservicesBootApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    public void contextLoads() {
        System.out.println(testService.hello());
    }
}
