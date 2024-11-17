package com.aravind.spring_framework.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, Integer age, Address address){}
record Address(String street, String city){}

@Configuration
public class HellowWorldConfiguraiton {

    @Bean
    public String name() {
        return "Robben";
    }

    @Bean
    public Integer age() {
        return 29;
    }

    @Bean
    public Person person() {
        return new Person("Robben", 29, new Address("Rio", "Sao Paulo"));
    }

    @Bean
    public Person person2() {
        return new Person("Ronaldinho", 29, new Address("Utrecht","Berlin"));
    }

    @Bean
    public Person personWithMethodCall() {
        return new Person(name(), age(),address());
    }
    @Bean
    public Address address() {
        return new Address("Baker street", "London");
    }

    @Bean
    public Person personWithParam(String name, Integer age, Address address) {
        return new Person(name, age, address);
    }
}
