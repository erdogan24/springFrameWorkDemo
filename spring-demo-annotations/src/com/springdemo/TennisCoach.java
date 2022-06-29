package com.springdemo;



public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach inside default constructor");
	}
	
	// define a setter method
	
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">>TennisCoach inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
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
