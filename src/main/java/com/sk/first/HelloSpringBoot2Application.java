package com.sk.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@Lazy
public class HelloSpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBoot2Application.class, args);
	}
}

@RestController
class Greet{
	@Autowired
	private HelloService helloService;

	@GetMapping("/greet")
	public String greet(@RequestParam String name){
		return "hello : " + name + helloService.doService();
	}

	@GetMapping("/")
	public String greet(){
		return "hello : User " + helloService.doService();
	}
}
