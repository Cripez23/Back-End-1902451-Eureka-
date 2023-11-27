package com.microservice.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.microservice.commons.users.entity"})
@SpringBootApplication
public class SpringbootServiceUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceUsuariosApplication.class, args);
	}

}
