package com.hr.springBootService.test.web;

import com.hr.springBootService.test.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/helllo/dto")
    public HelloResponseDto helloDto(@RequestParam("name")String name,
                                     @RequestParam("amount")int amount){
        return new HelloResponseDto(name, amount);
    }

}

//@RequestParam : 외부에서 넘긴 파라미터를 가져오는 어노테이션
