package com.gcp.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.gcp","com.gcp.repository"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.gcp.repository")
@ComponentScan
@EntityScan("com.gcp.entity")
public class AccountOpeningApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountOpeningApplication.class, args);
	}
	
}
