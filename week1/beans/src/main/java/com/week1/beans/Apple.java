package com.week1.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {

    @PostConstruct
    public void init(){
        System.out.println("The bean construction is finished");
    }

    public String getAppleName(){
        return "Hi I am apple";
    }

    @PreDestroy
    public void exit(){
        System.out.println("The bean is getting destroyed now");
    }

}
