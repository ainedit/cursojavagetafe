package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static Session getSession() {
		SessionFactory sessionFactory = new Configuration()
                .configure() // Carga hibernate.cfg.xml
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        
		return session;
	}
	
}
