package com.accenture.tpfinal.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.tpfinal.model.Auto;
import com.accenture.tpfinal.model.Empleado;

public class EmpleadoDAO implements IEmpleadoDAO
{

	@Autowired
	SessionFactory sessionFactory;
	IEmpleadoDAO empleadoDAO;
	
	
	@Transactional
	public Empleado getEmpleado(Long dni) {
		Session session = sessionFactory.openSession();
		Empleado empleado = (Empleado) session.load(Empleado.class, dni);
		session.close();
		return empleado;
	}

	public List<Empleado> listEmpleado() {
		Session session = sessionFactory.openSession();
		List<Empleado> listaEmpleados = session.createQuery("from Empleado").list();
		session.close();
		return listaEmpleados;
	}
	
	@Transactional
	public void addEmpleado(Empleado empleado) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(empleado);
		tx.commit();
		session.close();
		
	}

	public void updateEmpleado(Empleado empleado) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(empleado);
		tx.commit();
		session.close();	
		
	}
	
	@Transactional
	public void removeEmpleado(long dni) {
		Session session = sessionFactory.openSession();
		Empleado d = session.get(Empleado.class, dni);
		Transaction tx = session.beginTransaction();
		session.delete(d);
		tx.commit();
		session.close();
		
	}

}
