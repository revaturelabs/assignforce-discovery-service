package com.revature.assignforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceApplication {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(DiscoveryServiceApplication.class).run(args);
//		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}

}
