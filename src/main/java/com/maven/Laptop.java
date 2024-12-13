package com.maven;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer {
     
    public Laptop(){
       System.out.println("laptop object is calling.......");
     }

    @Override
     public void compile(){
        System.out.println("compiling using laptop...");
      }
}
