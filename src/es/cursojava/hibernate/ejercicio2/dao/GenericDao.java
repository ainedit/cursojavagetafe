package es.cursojava.hibernate.ejercicio2.dao;

public interface GenericDao {
	void commitTransaction();

	void rollbackTransaction();
}
