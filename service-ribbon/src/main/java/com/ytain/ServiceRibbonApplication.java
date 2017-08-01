package com.ytain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。<br>
 * Feign也用到ribbon，当你使用@FeignClient，ribbon自动被应用<br>
 * 在工程的启动类中:<br>
 * 通过@EnableDiscoveryClient向服务中心注册；并且注册了一个bean: restTemplate;<br>
 * 通过@LoadBalanced注册表明，这个restRemplate是负载均衡的。<br>
 * 在微服务架构中，我们将业务拆分成一个个的服务，服务与服务之间可以相互调用（RPC）。<br>
 * 为了保证其高可用，单个服务又必须集群部署。<br>
 * 由于网络原因或者自身的原因，服务并不能保证服务的100%可用，如果单个服务出现问题，调用这个服务就会出现网络延迟，此时若有大量的网络涌入，会形成任务累计，导致服务瘫痪，甚至导致服务“雪崩”。<br>
 * 为了解决这个问题，就出现断路器模型@EnableHystrix。<br>
 * 
 * @author dww_w
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
