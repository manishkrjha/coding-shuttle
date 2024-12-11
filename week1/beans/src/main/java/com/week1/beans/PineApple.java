package com.week1.beans;

import jakarta.annotation.PostConstruct;

public class PineApple {

    @PostConstruct
    public void init(){
        System.out.println("Post construct of pineapple");
    }

    public String getMyResponse(){
        return "Hey this is pineapple bean";
    }

}
