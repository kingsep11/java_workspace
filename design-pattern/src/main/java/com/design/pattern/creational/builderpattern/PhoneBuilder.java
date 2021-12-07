package com.design.pattern.creational.builderpattern;

/**
 * 
 * @author rduraira
 * building a complex objects with step by step is builder pattern
 */

public class PhoneBuilder {

	private String os;
	private String processor;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Phone constructPhone() {
		return new Phone(os, processor);
	}
	
}
