package com.samples.hibernate;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samples.hibernate.domain.contacts;
import com.samples.hibernate.domain.user;

public class App 
{
	 public void saveUser() {
		 
		 contacts contact= new contacts();
		 contact.setEmail("dfdgfd@dnsk.com");
		 contact.setPhone("123455");
		 
		 	user userObj = new user();
	        userObj.setId(3);
	        userObj.setName("test");
	        //userObj.setEmail("dfdgfd@dnsk.com");
	        userObj.setEmail(contact);

	        Configuration config = new Configuration().configure();
	        SessionFactory sf = config.buildSessionFactory();
	        Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(userObj);
	        tx.commit();
	 }

	 public user getUser() {
		 	user userObj = new user();

	        Configuration config = new Configuration().configure();
	        SessionFactory sf = config.buildSessionFactory();
	        Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();
	        //userObj= session.get(user.class,1);
	        Query qry = session.createQuery("from user where id = 1");
	        userObj= (user)qry.getSingleResult();
	        tx.commit(); session.close();
	        return userObj;
	 }

    public static void main( String[] args )
    {
    	//App obj = new App();
    	//System.out.println(obj.getUser());
    	//System.out.println(obj.getUser());
    	//obj.saveUser();
    	
    	user userObj = new user();
    	user userObj1 = new user();

        Configuration config = new Configuration().configure();
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //userObj= session.get(user.class,1);
        Query qry = session.createQuery("from user where id = 1");
        userObj = (user)qry.getSingleResult();
        tx.commit(); session.close();
        System.out.println(userObj);
        
        
        Session session1 = sf.openSession();
        Transaction tx1 = session1.beginTransaction();
        //userObj= session.get(user.class,1);
        Query qry1 = session1.createQuery("from user where id = 1");
        userObj1 = (user)qry1.getSingleResult();
        tx1.commit(); session1.close();
        System.out.println(userObj1);
    }
}
