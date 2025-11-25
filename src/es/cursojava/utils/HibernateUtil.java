package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Session session;
	
	private static Session getSession() {
		SessionFactory sessionFactory = new Configuration()
                .configure() // Carga hibernate.cfg.xml
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        
		return session;
	}
	
	public static Session getSessionFactory() {
		if (session == null || !session.isOpen()) {
			session = getSession();
		}
		return session;
	}
	
	
}
