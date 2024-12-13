package com.maven.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.maven.Bobby;
import com.maven.Computer;
import com.maven.Desktop;
import com.maven.Laptop;

@Configuration
@ComponentScan("com.maven")
public class AppConfig {

    // // if you want to configure your application by using java based approach we  need to add @Configuration annotation
    // // in XML we use bean tag, here we need to use @Bean annotation
    //      // we can use single or  multiple names --> @Bean(name = "com2") or   @Bean(name = {"com2","desktop1"})
    //      // we can use @Qualifier("desktop1")   in boobby (), if we need call specificly one bean      
    //            @Bean
    //             public Bobby bobby(  Computer com){
    //                 Bobby obj = new Bobby();
    //                 obj.setAge(21);
    //                 obj.setCom(com);
    //                 return obj;
    //             }
                
    //             @Bean
    //             // @Scope("prototype")
                
    //             public Desktop desktop1(){
    //                 return new Desktop();
    //             }

    //             @Bean
    //             @Primary
    //             public Laptop laptop1(){
    //                 return new Laptop();
    //             }

}
