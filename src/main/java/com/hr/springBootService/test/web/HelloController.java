package com.hr.springBootService.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController : 컨트롤러를 JSON으로 반환하는 컨트롤러로 만들어 준다.
@RestController
public class HelloController {

    // @GetMapping : HTTP Method인 GET의 요청을 받을 수 있는 API를 만들어 준다.
    // "/hello"로 요청이 들어오면 문자열 "HELLO!!!"를 반환하는 기능을 가짐
    @GetMapping("/hello")
    public String hello(){
        return "HELLO!!!";
    }
}
