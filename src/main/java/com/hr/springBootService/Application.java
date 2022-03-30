package com.hr.springBootService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication : 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
//@SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트 최상단에 위치해야 한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run : 내장 WAS 실행!
        //내장 WAS : 별도로 외부에 WAS를 두지 않고 어플리케이션을 내부에서 실행하는 것(톰캣 설치 X)
        //스프링 부트에서는 내장 WAS를 사용하는 것을 권장
        SpringApplication.run(Application.class, args);
        //import 단축키 : [Option + Enter]
    }
}


