package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;
    @GetMapping("/test")
    public String test() {
        return testService.test();
    }
}