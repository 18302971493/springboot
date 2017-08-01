package com.ytain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 在这里，我们需要用的的组件上Spring Cloud Netflix的Eureka ,eureka是一个服务注册和发现模块<br>
 * 启动一个服务注册中心，只需要一个注解@EnableEurekaServer，这个注解需要在springboot工程的启动application类上加
 * @author dww_w
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class InitialirApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialirApplication.class, args);
	}
}
