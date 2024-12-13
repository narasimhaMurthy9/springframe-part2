package com.maven;

import org.springframework.stereotype.Component;

@Component("desktop1")
public class Desktop implements Computer{

    public Desktop (){
        System.out.println("created desktop...");
    }
    @Override
    public void compile(){
       System.out.println("compiling using desktop...");
     }
}
