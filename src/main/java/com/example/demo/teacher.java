package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class teacher implements human{
    public void teach() {
        System.out.println("Teaching...");
    }
    public void speak() {
        System.out.println("Teacher Speaking...");
    }
}
