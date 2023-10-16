package org.ncu.hirewheels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.ncu.hirewheels")
@EnableJpaRepositories(basePackages = "org.ncu.hirewheels.repository")
@EntityScan(basePackages = "org.ncu.hirewheels.entities")
public class HireWheelsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HireWheelsApplication.class, args);
	}

}
