package com.schoolmall.xc.micro.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaTwoApplication {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=peer2";
		SpringApplication.run(CloudEurekaTwoApplication.class, args);
	}
}
