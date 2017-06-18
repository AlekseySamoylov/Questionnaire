package com.alekseysamoylov.questionnaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alekseysamoylov on 6/18/17.
 */
@Controller
public class TestController {

    @RequestMapping("/hi")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
