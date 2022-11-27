package com.mypersistentproject.hibernate;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;

public class StoreData {
//orm
	public static void main (String args[]) {
	 StandardServiceRegistry ssrs = 
			 new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	 Metadata meta = new MetadataSources(ssrs).getMetadataBuilder().build();
	 SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
	 Session session = factory.openSession(); //open a session
	 Transaction t=session.beginTransaction();
	 
	 MyFirstHibernatePersistent obj = new MyFirstHibernatePersistent();
	 obj.setFirstName("Test");
	 obj.setId(12);
	 obj.setLastName("test2");
	 session.save(obj);
	 t.commit();
	 factory.close();
	 session.close();
	}
}
