package com.aravind.spring_framework;

import com.aravind.spring_framework.configuration.HellowWorldConfiguraiton;
import com.aravind.spring_framework.configuration.Person;
import com.aravind.spring_framework.configuration.Address;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SpringFrameworkApplication.class, args);

		var context = new AnnotationConfigApplicationContext(HellowWorldConfiguraiton.class);
		String name = context.getBean("name").toString();
		System.out.println(name);

		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3Param"));

		System.out.println(context.getBean("person4Param"));

		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));

//		Game game = new SuperContra();
//		GameRunner gameRunner = new GameRunner(game);
//		gameRunner.run();


	}

}
