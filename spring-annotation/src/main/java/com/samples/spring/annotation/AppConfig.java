package com.samples.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.samples.spring.annotation")
public class AppConfig {

	/**@Bean
	public Samsung getSamsung() {
		return new Samsung();
	}
	
	@Bean
	public QuadCore getProcessor() {
		return new QuadCore();
	}**/
}
