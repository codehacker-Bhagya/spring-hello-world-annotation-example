package com.bhagya.practice.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String greet(){
        return "hello world";
    }
}
