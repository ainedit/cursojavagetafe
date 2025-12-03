package es.cursojava.hibernate;

import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.entities.CarnetBiblioteca;
import es.cursojava.hibernate.entities.Estudiante;
import es.cursojava.utils.HibernateUtil;

public class EstudianteMain {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory();
		
		Transaction tx = session.beginTransaction();
		
//		CarnetBiblioteca carnet = new CarnetBiblioteca(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now().plusYears(1)));
//		Estudiante estudiante1 = new Estudiante("Estudiante1", "estudiante1@asdasd.es", 20);
//		//Estudiante estudiante2 = new Estudiante("Estudiante2",  20, "estudiante1@asdasd.es", carnet);
//		estudiante1.setcarnetBiblioteca(carnet);
//		
//		session.persist(estudiante1);
		
		System.out.println("Consultando estudiante con id 1");
		Estudiante estu = session.get(Estudiante.class, 1);
		System.out.println("Estudiante consultado");
//		System.out.println(estu);
//		System.out.println(estu.getCarnetBiblioteca().getFechaDeEmision());
		
		tx.commit();
		session.close();
	}

}
