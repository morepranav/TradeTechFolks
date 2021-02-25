package com.gcp.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.gcp"})
public class AccountOpeningApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountOpeningApplication.class, args);
	}
	
}
