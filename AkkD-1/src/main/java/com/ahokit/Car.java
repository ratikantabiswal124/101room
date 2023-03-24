package com.ahokit;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine eng=null;

	public void setEng(Engine eng) {
		System.out.println("**Seteng() method call");
		this.eng = eng;
	}
	
	public void Drive() {
		Integer engstatus=eng.start();
		if(engstatus==0) {
			System.out.println("**Journey started");
		}
	}
	
}
