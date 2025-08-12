package com.learn.webproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WebprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebprojApplication.class, args);
	}

}
