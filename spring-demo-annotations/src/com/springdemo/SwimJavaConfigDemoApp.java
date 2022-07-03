package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//dsfg
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods
		System.out.println("email:" + theCoach.getEmail());
		System.out.println("team:" + theCoach.getTeam());
		
		// closee the context
		
		context.close();
	}

} 