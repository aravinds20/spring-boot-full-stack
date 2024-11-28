package com.aravind.spring_framework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
    @Primary
    public Person person() {
        return new Person("Robben", 29, address2());
    }

    @Bean
    public Person person2(Address address3) {
        return new Person("Ronaldinho", 29, address3);
    }

    @Bean
    public Person person3Param(String name, Integer age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person4Param(String name, Integer age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean
    public Person personWithMethodCall() {
        return new Person(name(), age(),address());
    }
    @Bean
    @Primary
    public Address address() {
        return new Address("Baker street", "London");
    }
    @Bean(name = "address2")
    public Address address2() {
        return new Address("Rio", "Sao Paulo");
    }
    @Bean(name = "address3")
    public Address address3() {
        return new Address("Utrecht","Berlin");
    }
}
