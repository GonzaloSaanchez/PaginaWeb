package com.accenture.tpfinal.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.tpfinal.model.Propietario;

public class PropietarioDAO implements IPropietarioDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public Propietario getPropietario(long dni) {
		Session session = sessionFactory.openSession();
		Propietario propietario = (Propietario) session.load(Propietario.class, dni);
		session.close();
		return propietario;
	}

	public List<Propietario> listPropietario() {
		Session session = sessionFactory.openSession();
		List<Propietario> listaProp = session.createQuery("from Propietario").list();
		session.close();
		return listaProp;
	}
	@Transactional
	public void addPropietario(Propietario prop) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(prop);
		tx.commit();
		session.close();
	}

	public void updatePropietario(Propietario prop) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(prop);
		tx.commit();
		session.close();		
	}
	
	@Transactional
	public void removePropietario(long dni) {
		Session session = sessionFactory.openSession();
		Propietario d = session.get(Propietario.class, dni);
		Transaction tx = session.beginTransaction();
		session.delete(d);
		tx.commit();
		session.close();
	}
	
}
