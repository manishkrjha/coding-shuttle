package com.week1.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PineApple pineApple(){
        return new PineApple();
    }

}
