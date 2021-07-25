package com.devops.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.devops.main") 
@EntityScan("com.devops.main")
@SpringBootApplication
public class SampleSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootAppApplication.class, args);
	}

}
