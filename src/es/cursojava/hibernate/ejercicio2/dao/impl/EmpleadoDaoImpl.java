package es.cursojava.hibernate.ejercicio2.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicio2.dao.EmpleadoDao;
import es.cursojava.hibernate.ejercicio2.model.Empleado;
import es.cursojava.utils.HibernateUtil;

public class EmpleadoDaoImpl implements EmpleadoDao {

	private Session session;
	private Transaction transaction;

	public EmpleadoDaoImpl() {
		session = HibernateUtil.getSessionFactory();
		transaction = session.beginTransaction();
	}

    @Override
    public void guardar(Empleado empleado) {
        //session.merge(empleado); // merge handles both save and update
        session.persist(empleado);
        session.flush();
        //session.saveOrUpdate(empleado);
        
    }

    @Override
    public Empleado buscarPorId(Long id) {
    	Empleado empleado = session.get(Empleado.class, id);
    	transaction.commit();
        return empleado;
        
    }

    @Override
    public Empleado buscarPorNif(String nif) {
        Query<Empleado> query = session.createQuery("FROM Empleado WHERE nif = :nifEmpleado", Empleado.class);
        query.setParameter("nifEmpleado", nif);
        //transaction.commit();
        return query.uniqueResult();
    }

    @Override
    public List<Empleado> buscarPorDepartamento(String departamento) {
        Query<Empleado> query = session.createQuery("FROM Empleado WHERE departamento = :dept", Empleado.class);
        query.setParameter("dept", departamento);
        transaction.commit();
        return query.list();
    }

    @Override
    public List<Empleado> buscarTodos() {
    	List<Empleado> empleados = session.createQuery("FROM Empleado", Empleado.class).list();
    	transaction.commit();
        return empleados;
        
    }

    public void commitTransaction() {
		transaction.commit();
	}

	@Override
	public void rollbackTransaction() {
		transaction.rollback();
	}
    
    
}
