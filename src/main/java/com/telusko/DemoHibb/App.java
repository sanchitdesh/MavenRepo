package com.telusko.DemoHibb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien a=null;
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    
    	
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
       Session session=sf.openSession();
     
   session.beginTransaction();
     //telusko=(Alien)session.get(Alien.class,111);
   a=(Alien) session.get(Alien.class,102);
   System.out.println(a);
   
   session.getTransaction().commit();
   session.close();
   
 
   
  
   
     
    }
}
