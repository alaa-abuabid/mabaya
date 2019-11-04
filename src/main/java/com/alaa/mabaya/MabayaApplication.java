package com.alaa.mabaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.alaa.mabaya.repository")
@SpringBootApplication
public class MabayaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MabayaApplication.class, args);
	}

}
