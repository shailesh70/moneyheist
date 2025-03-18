package com.shailesh.moneyheist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

public class MoneyHeistApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyHeistApplication.class, args);
	}


}
