package com.example.c4.mvc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password){
        System.out.println("email : " + email + " password : " + password);
        System.out.println("로그인이 성공적으로 완료되었습니다.");
        return "200 OK";
    }
}
