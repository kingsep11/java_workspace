package com.design.pattern.creational.builderpattern;

public class Phone {

	private String os;
	private String processor;
	
	public Phone(String os, String processor) {
		super();
		this.os = os;
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "[os="+this.os+"]";
	}
	
}
