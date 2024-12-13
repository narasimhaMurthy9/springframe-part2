package com.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import java.beans.ConstructorProperties;
 @Component
public class Bobby {
 
   //add value by using Value annotation
   @Value("21")
   private int age;
   private Laptop lap;
   // by using autowired we are saying, hey spring go to your container then u will get a com object
   @Autowired
   // here bean name we are passing in Qualifier is as same as class name but small letters
   //Qualifier is used for get rid from confusion by passing name
   @Qualifier("laptop")
   private Computer com;

   // constructor
        public Bobby(){
            System.out.println("object created....from Bobby");
        }
                
        public Laptop getLap() {
            System.out.println("getting lap called");
            return lap;
        }

        public void setLap(Laptop lap) {
            System.out.println("setting lap called");
            this.lap = lap;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            System.out.println(age + "age setter called");
            this.age = age;
        }

        public Computer getLCom() {
            System.out.println("getting com called");
            return com;
        }

        public void setCom(Computer com) {
            System.out.println("com setting com called");
            this.com = com;
        }
    
        public void code() {
            System.out.println("coding....");
            com.compile();
        }
         



// if we are using constructor-are with name in spring.xml we need to use ConstructorProperties
// @ConstructorProperties({"age","lap"})


// // parameterise constructor

//             public Bobby(int age, Laptop lap){
//                 this.age = age;
//                 this.lap = lap;
//                 System.out.println("object created....from parameterised constructor");
//             }

   
     

}
