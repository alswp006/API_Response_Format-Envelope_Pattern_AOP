package com.example.api_response_format_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@SpringBootApplication
public class ApiResponseFormatAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiResponseFormatAopApplication.class, args);
	}

}
