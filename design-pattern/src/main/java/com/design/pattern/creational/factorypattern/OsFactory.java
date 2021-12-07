package com.design.pattern.creational.factorypattern;

public class OsFactory {

	public OS getOS(String osName) {
		if("Android".equals(osName)) {
			return new Android();
		}
		else if("IOS".equals(osName)) {
			return new IOS();
		}
		return null;
	}
}
