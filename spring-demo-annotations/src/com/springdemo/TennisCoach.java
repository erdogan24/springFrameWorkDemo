package com.springdemo;

public class TennisCoach implements Coach {

	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach inside default constructor");
	 }
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach : inside of doMyStartupStuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff()	{
		System.out.println(">> TennisCoach inside  of doMyCleanupStuff()");
	}
	/*
	public void doSomeCrazySruff(FortuneService theFortuneService) {
		System.out.println(">>TennisCoach inside doSomeCrazySruff() method");
		fortuneService = theFortuneService;
	}
	*/
	/*
	public TennisCoach(FortuneService theFortuneService) {
	fortuneService = theFortuneService;	
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
