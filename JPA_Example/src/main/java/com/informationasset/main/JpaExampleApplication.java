package com.informationasset.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages= {"com.informationasset.*"})
@ComponentScan("com.informationasset.repository")

public class JpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}

}