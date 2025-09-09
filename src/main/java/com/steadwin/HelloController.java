package com.steadwin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello Ritik! Spring Boot is Working 🚀 First program connected ";
    }
}

