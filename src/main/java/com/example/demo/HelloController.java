package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
// @CrossOrigin(origins = "*")
// @CrossOrigin(origins = "http://localhost:5174")
public class HelloController {

    @GetMapping("/api/hello") // GET 요청을 /api/hello 경로로 매핑합니다.
    public String hello() {
        return "Hello from Spring Boot!"; // 요청이 오면 이 문자열을 반환합니다.
    }
}