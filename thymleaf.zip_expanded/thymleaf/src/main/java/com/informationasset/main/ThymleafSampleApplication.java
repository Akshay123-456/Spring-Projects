package com.informationasset.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.informationasset"})
public class ThymleafSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymleafSampleApplication.class, args);
	}

}
