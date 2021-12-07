package com.samples.hibernate.domain;

import javax.persistence.Embeddable;

@Embeddable
public class contacts {

	private String email;
	private String phone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
