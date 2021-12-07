package com.samples.spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void ride() {
		System.out.println("lets go for walk");
	}
}
