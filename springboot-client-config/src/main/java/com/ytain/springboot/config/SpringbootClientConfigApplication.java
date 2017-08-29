package com.ytain.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringbootClientConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootClientConfigApplication.class, args);
	}
	
    String message;
    @RequestMapping(value = "/hi")
    public String hi(){
        return message;
    }
}
