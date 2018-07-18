package com.accenture.tpfinal.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.tpfinal.model.Orden;

public class OrdenDAO implements IOrdenDAO
{

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public Orden getOrden(Long id) {
		Session session = sessionFactory.openSession();
		Orden orden = (Orden) session.load(Orden.class, id);
		session.close();
		return orden;
	}

	public List<Orden> listOrden() {
		Session session = sessionFactory.openSession();
		List<Orden> listaOrdenes = session.createQuery("from Orden").list();
		session.close();
		return listaOrdenes;
	}

	@Transactional
	public void addOrden(Orden orden) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(orden);
		tx.commit();
		session.close();
	}

	public void updateOrden(Orden orden) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(orden);
		tx.commit();
		session.close();		
		
	}

	@Transactional
	public void removeOrden(long id) {
		Session session = sessionFactory.openSession();
		Orden d = session.get(Orden.class, id);
		Transaction tx = session.beginTransaction();
		session.delete(d);
		tx.commit();
		session.close();	
	}

}
