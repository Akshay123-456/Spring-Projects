package com.informationasset.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.informationasset"})
public class JdbcTempletApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcTempletApplication.class, args);
	}

}
