package com.dsa.systemdesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class SystemdesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemdesignApplication.class, args);
	}

}
