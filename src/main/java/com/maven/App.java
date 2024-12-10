package com.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        ApplicationContext  context=  new ClassPathXmlApplicationContext("spring.xml");
        Bobby obj1 = (Bobby) context.getBean("bobby"); // it get id i.e, bobby from spring.xml file
        obj1.code();
        System.out.println(obj1.getAge()); 

        // Bobby obj2 = (Bobby) context.getBean("bobby"); // it get id i.e, bobby from spring.xml file
        // obj2.code();
    }
}
