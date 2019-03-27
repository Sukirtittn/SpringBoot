package com.example.SpringBoot;
import com.example.SpringBoot.entity.Database;
import com.example.SpringBoot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.example.SpringBoot.entity"})
@EnableJpaRepositories(basePackages = {"com.example.SpringBoot.repository"})
@SpringBootApplication
public class Application {

	// Question 3.
	@Bean
	public User user() {
		User user = new User("Sukirti", "12345");
		return user;
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
