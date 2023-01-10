package com.example.demoSpringBootAutoConfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBootAutoConfigureApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext =  SpringApplication.run(DemoSpringBootAutoConfigureApplication.class, args);
		System.out.print("Hello ");
		if (applicationContext.getBeanNamesForAnnotation(CustomAnnotation.class).length > 0) {
			System.out.println(applicationContext.getBeanNamesForAnnotation(CustomAnnotation.class)[0]);
		} else {
			System.out.println("world!");
		}
	}

}
