package com.design.pattern;

import com.design.pattern.creational.builderpattern.Phone;
import com.design.pattern.creational.builderpattern.PhoneBuilder;

public class BuilderPatternMain {

	public static void main(String[] args) {
    	// Builder pattern
    	Phone phone = new PhoneBuilder().setOs("Android").setProcessor("Quad core").constructPhone();
    	System.out.println(phone);

	}

}
