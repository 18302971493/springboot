package com.ytain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InitialirApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialirApplication.class, args);
	}
}
