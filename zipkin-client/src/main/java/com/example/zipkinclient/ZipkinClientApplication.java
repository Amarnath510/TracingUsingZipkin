package com.example.zipkinclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ZipkinClientApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@GetMapping("/hi")
	public String hi() {
		String response = this.restTemplate().getForEntity("http://localhost:8081/hi", String.class)
				.getBody();
		System.out.println("**********" + response + "**********");
		return response;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ZipkinClientApplication.class, args);
	}
}
