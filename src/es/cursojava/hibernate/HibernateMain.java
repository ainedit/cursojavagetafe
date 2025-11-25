package es.cursojava.hibernate;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
    	Transaction tx = null;
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            System.out.println("Conectado");
                     
            tx = session.beginTransaction();
            
            Empresa empresa1 = new Empresa("Empresa1","S.A.","123123D","Venta Jabones", 
            					Calendar.getInstance().getTime());
            Empresa empresa2 = new Empresa("Empresa2","S.A.","17645D","Venta FunkoPop", 
            					Calendar.getInstance().getTime());
            
            session.persist(empresa1);
            session.persist(empresa2);
            
            tx.commit();
            
            List<Empresa> empresas = session.createQuery("from Empresa", Empresa.class).list();
            for (Empresa empresa : empresas) {
				System.out.println(empresa);
			}
            
            
        } catch (Throwable ex) {
        	try {
        		tx.rollback();
        	}catch (NullPointerException e) {
        		System.out.println("Transacción no creada");
			}
        	
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
