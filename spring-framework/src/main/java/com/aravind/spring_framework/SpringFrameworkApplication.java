package com.aravind.spring_framework;

import com.aravind.spring_framework.configuration.HellowWorldConfiguraiton;
import com.aravind.spring_framework.model.Game;
import com.aravind.spring_framework.model.GameRunner;
import com.aravind.spring_framework.model.SuperContra;
import com.aravind.spring_framework.model.SuperMario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SpringFrameworkApplication.class, args);

		var context = new AnnotationConfigApplicationContext(HellowWorldConfiguraiton.class);
		String name = context.getBean("name").toString();
		System.out.println(name);

		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("personWithParam"));

//		Game game = new SuperContra();
//		GameRunner gameRunner = new GameRunner(game);
//		gameRunner.run();

	}

}
