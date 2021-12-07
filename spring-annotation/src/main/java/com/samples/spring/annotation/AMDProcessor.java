package com.samples.spring.annotation;

import org.springframework.stereotype.Component;

@Component("amdprocessor")
public class AMDProcessor implements Processor{

	public void getProcessorName() {
		System.out.println("Worlds worst procesor");
	}

}
