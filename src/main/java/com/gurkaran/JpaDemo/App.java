package com.gurkaran.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a = new Alien();
    	a.setAid(5);
    	a.setAname("Jakk");
    	a.setTech("ML");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        em.persist(a); //Like that of save
        
        em.getTransaction().commit();
       // Alien al = em.find(Alien.class, 1);
        System.out.println(a);
    }
}
