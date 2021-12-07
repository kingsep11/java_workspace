package com.samples.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samples.hibernate.domain.Laptop;
import com.samples.hibernate.domain.student;

public class MappingMain {

	public static void main(String[] args) {

		Laptop l = new Laptop();
		l.setLid(1);
		l.setModel("Mac");

		Laptop l1 = new Laptop();
		l.setLid(2);
		l.setModel("Mac1");
		
		List<Laptop> laplist = new ArrayList<>();
		laplist.add(l);
		laplist.add(l1);
		
		student s = new student();
		s.setSid(101);
		s.setSname("raja");
		s.setLaptop(laplist);
		
        Configuration config = new Configuration().configure();
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(l); session.save(l1);
        session.save(s);
        tx.commit();

	}

}
