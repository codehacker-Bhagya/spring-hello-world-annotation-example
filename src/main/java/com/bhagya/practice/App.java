package com.bhagya.practice;

import com.bhagya.practice.Service.HelloService;
import com.bhagya.practice.model.Address;
import com.bhagya.practice.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static jdk.internal.classfile.impl.DirectCodeBuilder.build;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.bhagya.practice")
public class App 
{
    public static ApplicationContext context ;
    public static void main( String[] args ) {

        City city = City.builder().name("pune").build();
        city.setName("Pune");
        Address address = Address.builder().city(city).build();

        context = new AnnotationConfigApplicationContext(App.class);
        HelloService helloService = context.getBean("helloService" , HelloService.class);

        helloService.setName("Shrikant");
        helloService.setAddress(address);

        helloService.sayHello();
    }
}
