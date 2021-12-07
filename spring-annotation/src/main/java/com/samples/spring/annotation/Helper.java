package com.samples.spring.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

// Advice - is specifies custom method what to do
// PointCut - specifies when to do

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

	@Before("execution (public void getProcessorName())") // Advice
	public void log() {
		System.out.println("logger worked....");
	}
}
