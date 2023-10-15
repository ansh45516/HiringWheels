package org.ncu.hirewheels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.ncu.hirewheels.repository")
@EntityScan(basePackages = "org.ncu.hirewheels.entities")
public class HireWheelsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HireWheelsApplication.class, args);
	}

}
