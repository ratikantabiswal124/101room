package com.ahokit;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine() {
		System.out.println("0-param constructor");
	}
	
	public Integer start() {
		
		return 0;
	}

}
