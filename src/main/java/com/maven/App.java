package com.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.maven.config.AppConfig;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {

//   We can  talk to spring by using 3 different ways   a) XML  b)Java based config c) Annotations
//   we are here using xml method, so if we use xml method it will for xml in class path i.e, main
//   we need to add resources folder in main folder an create a xml file in it add that file in ClassPathXmlApplicationContext 


// -------------------------------------------- JAVA BASED APPROACH -------------------------------------
    ApplicationContext  context=  new AnnotationConfigApplicationContext(AppConfig.class);



     Bobby obj1 =  context.getBean( Bobby.class); 
        obj1.code();
   System.err.println(obj1.getAge());
// by default the bean name is same with method name i.e., desktop1
    Desktop dt = context.getBean("desktop1",Desktop.class);
    dt.compile();

    Laptop dt2 = context.getBean("laptop",Laptop.class);
    dt2.compile();


//    ----------------------------------------  XML APPROACH -----------------------------------------------------------


    //    ApplicationContext  context=  new ClassPathXmlApplicationContext("spring.xml");
    //     Bobby obj1 =  context.getBean("bobby", Bobby.class); // it get id i.e, bobby from spring.xml file
    //     obj1.code();
    //     System.out.println(obj1.getAge()); 
// because desktop is lazily initiated from xml it will wait upto we intilize like below
      //  Desktop obj =  context.getBean("com2",Desktop.class);
      
        // Bobby obj2 = (Bobby) context.getBean("bobby"); // it get id i.e, bobby from spring.xml file
        // obj2.code();
    }
}
