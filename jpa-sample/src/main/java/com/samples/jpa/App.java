package com.samples.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.samples.jpa.domain.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student studObj = new Student();
        
        studObj.setId(1);
        studObj.setName("name1");
        studObj.setMarks(50);
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(studObj);
        em.getTransaction().commit();
        
        System.out.println(em);
    }
}
