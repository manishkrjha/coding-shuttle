package com.week1.dependecy_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependecyInjectionApplication implements ApplicationRunner {

	@Autowired
	private DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(DependecyInjectionApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(dbService.getDBConfig());
	}
}
