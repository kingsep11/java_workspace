package com.design.pattern;

import com.design.pattern.creational.factorypattern.OS;
import com.design.pattern.creational.factorypattern.OsFactory;

/**
 * Hello world!
 *
 */
public class FactoryPatternMain 
{
    public static void main( String[] args )
    {
        // Factory pattern sample
    	
    	OsFactory osFactory = new OsFactory();
    	OS os = osFactory.getOS("Android");
    	os.showConfig();
    	    	

    }
}
