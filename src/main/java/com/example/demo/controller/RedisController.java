package com.example.demo.controller;

import com.example.demo.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RedisController {
    private final RedisService redisService;

    @GetMapping("/redis")
    public String redis() {
        redisService.redisString();
        return "test";
    }
}
