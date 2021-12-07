package com.samples.hibernate.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String model;
	
	@ManyToOne
	private student stu;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public student getStu() {
		return stu;
	}
	public void setStu(student stu) {
		this.stu = stu;
	}
	
	
}
