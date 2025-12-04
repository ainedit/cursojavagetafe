package es.cursojava.hibernate.ejercicio1.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicio1.entites.Aula;
import es.cursojava.utils.HibernateUtil;

public class AulaDAO {

	private Session session;
	private Transaction transaction;

	public AulaDAO() {
		session = HibernateUtil.getSessionFactory();
		transaction = session.beginTransaction();
	}
	
    public Aula save(Aula aula) {
        session.persist(aula);
        return aula;
    }

    public Aula findById(Long id) {
       return session.get(Aula.class, id);
    }
}
