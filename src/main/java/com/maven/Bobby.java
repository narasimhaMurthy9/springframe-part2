package com.maven;

//import java.beans.ConstructorProperties;

public class Bobby {

   private int age;
   private Laptop lap;
   private Computer com;
        
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
            System.out.println("setter called");
            this.age = age;
        }

        public Computer getLCom() {
            System.out.println("getting com called");
            return com;
        }

        public void setCom(Computer com) {
            System.out.println("setting com called");
            this.com = com;
        }
    
        public void code() {
            System.out.println("coding....");
            com.compile();
        }
         

// constructor
   public Bobby(){
    System.out.println("object created....from constructor");
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
