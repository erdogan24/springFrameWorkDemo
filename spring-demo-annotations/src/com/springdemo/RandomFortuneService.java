package com.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	private String[] data = {
			" hello", 
			"my name is ",
			"erdogan"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
		
	}

}
