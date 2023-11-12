package com.celulares.celulares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CelularesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CelularesApplication.class, args);
	}

}
