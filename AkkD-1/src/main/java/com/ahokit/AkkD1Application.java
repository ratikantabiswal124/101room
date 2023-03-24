package com.ahokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AkkD1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AkkD1Application.class, args);
		Car car = run.getBean(Car.class);
		car.Drive();
	}

}
