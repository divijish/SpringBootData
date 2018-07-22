package io.springboot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
}
