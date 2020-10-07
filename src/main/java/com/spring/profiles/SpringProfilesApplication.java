package com.spring.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringProfilesApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringProfilesApplication.class);

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${server.email}")
	private List<String> email;

	@Value("${server.host}")
	private String host;

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LOGGER.info("Application Name : " + applicationName);
		LOGGER.info("Email : " + email.toString());
		LOGGER.info("Host Address : " + host);
	}

}
