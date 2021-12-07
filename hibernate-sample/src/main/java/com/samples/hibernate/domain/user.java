package com.samples.hibernate.domain;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "test_user")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class user {
		@Id
		private int id;
	    private String name;
	    
	    private contacts email;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public contacts getEmail() {
			return email;
		}
		public void setEmail(contacts email) {
			this.email = email;
		}
	@Override   
	public String toString() {
		return "[email "+email+" name "+name+" id "+id+"]";
		
	}
}
