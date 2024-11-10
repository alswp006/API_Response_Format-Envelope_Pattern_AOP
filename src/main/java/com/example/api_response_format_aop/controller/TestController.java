package com.example.api_response_format_aop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/api/success")
    public String success() {
        return "성공!!";
    }

    @GetMapping("/api/fail")
    public String fail() {
        throw new IllegalArgumentException("잘못된 요청입니다.");
    }

    @GetMapping("/api/error")
    public String error() {
        throw new RuntimeException("알 수 없는 에러가 발생하였습니다.");
    }
}