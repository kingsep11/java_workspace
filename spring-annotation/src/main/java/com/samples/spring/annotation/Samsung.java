package com.samples.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {

	@Autowired
	@Qualifier("quadcore")
	Processor qc;
	
	public Processor getQc() {
		return qc;
	}

	public void setQc(Processor qc) {
		this.qc = qc;
	}

	public void getConfig() {
		System.out.println("Glaxy S7 Core 2 duo 13MP camera");
		qc.getProcessorName();
	}
}
