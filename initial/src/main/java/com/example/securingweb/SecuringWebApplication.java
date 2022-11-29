package com.example.securingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class SecuringWebApplication {

	public static void main(String[] args) throws Throwable {
		/*SpringApplication app= new SpringApplication(SecuringWebApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8081"));*/
		SpringApplication.run(SecuringWebApplication.class, args);

	}

}
