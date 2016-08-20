package com.example.jafs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application launcher.
 * Most of the application level settings are mentioned here.
 * @author pulgupta
 * @version 1.0.0.0
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class JafsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JafsApplication.class, args);
	}
}
