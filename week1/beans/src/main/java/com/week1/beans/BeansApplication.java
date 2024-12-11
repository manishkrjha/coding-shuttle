package com.week1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansApplication implements ApplicationRunner {

	@Autowired
	private Apple apple;

	@Autowired
	private PineApple pineApple;

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(apple.getAppleName());
		System.out.println(pineApple.getMyResponse());
	}
}
