package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
public class student implements human{
    //field injection
    //@Autowired
    human h;


    //constructor injection
    //student(human h){
    //    this.h=h;
    //}


    //setter injection
    //@Autowired
    //public void setH(human h) {
    //    this.h = h;
    //}
    public void study() {
        System.out.println("Studying...");
        
        //h.speak();
    }
    public void speak() {
        System.out.println("Student Speaking...");
    }
}
