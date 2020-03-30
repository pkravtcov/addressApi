package com.mastercard.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressChangeMain {
	
	/**
	 * Spring Boot application which generates random address via api
	 * 
	 * @author Pavel Kravtcov
	 */
	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(AddressChangeMain.class, args);
		
	}

}
