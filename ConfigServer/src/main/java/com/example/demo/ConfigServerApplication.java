// The package name for this Java file
package com.example.demo;

// Importing necessary classes from Spring Boot and Spring Cloud
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

// Annotation to declare the class as a Spring Boot application
@SpringBootApplication

// Annotation to enable Spring Cloud Config Server
@EnableConfigServer

// Annotation to enable service discovery for the Config Server
@EnableDiscoveryClient
public class ConfigServerApplication {

	// Main method to run the Spring Boot application
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}