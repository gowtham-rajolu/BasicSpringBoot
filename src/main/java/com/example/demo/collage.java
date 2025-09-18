package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class collage {
    @Autowired
    @Qualifier("student")
    human st;
    @Autowired
    @Qualifier("teacher")
    human t;
    public void activity(){
        st.speak();
        t.speak();
    }
}
