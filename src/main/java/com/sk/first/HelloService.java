package com.sk.first;

import org.springframework.stereotype.Service;

@Service
public class HelloService{

    public String doService(){
        return " : Service call ";
    }
}