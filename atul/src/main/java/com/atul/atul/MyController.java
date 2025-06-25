package com.atul.atul;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class MyController {
    @RequestMapping("m")
    public static String getGreeting() {
        return "Hello, World!";
    }
    @PostMapping("process-form")
    public static String processForm(@RequestParam int num1, @RequestParam int num2) {
        return String.valueOf(num1+num2);
    }
    
}
