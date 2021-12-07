package com.samples.spring.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("quadcore")
public class QuadCore implements Processor{

	public void getProcessorName() {
		System.out.println("worlds best processor....");
	}

}
