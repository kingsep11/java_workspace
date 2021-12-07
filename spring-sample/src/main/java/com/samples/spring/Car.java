package com.samples.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	@Autowired
	Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("lets go for walk - ca");
	}

	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("This car has "+tyre.getBrand()+" tyres");
	}
}
