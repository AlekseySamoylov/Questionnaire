package com.alekseysamoylov.questionnaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Test controller
 */
@Controller
public class TestController {

    @RequestMapping("/hi/{name}")
    public String hello(Map<String, Object> model, @PathVariable String name) {
        model.put("name", name);
        return "hello";
    }
}
