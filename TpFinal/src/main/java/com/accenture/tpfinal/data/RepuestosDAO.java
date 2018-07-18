package com.accenture.tpfinal.data;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.tpfinal.controller.RepuestosController;
import com.accenture.tpfinal.model.Repuestos;

public class RepuestosDAO implements IRepuestosDAO
{

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public Repuestos getRepuesto(Long id) {
		Session session = sessionFactory.openSession();
		Repuestos repuesto = (Repuestos) session.load(Repuestos.class, id);
		session.close();
		return repuesto;
	}

	public List<Repuestos> listRepuesto() {
		Session session = sessionFactory.openSession();
		List<Repuestos> listaRepuestos = session.createQuery("from Repuestos").list();
		session.close();
		return listaRepuestos;
	}
	@Transactional
	public void addRepuesto(Repuestos repuesto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(repuesto);
		tx.commit();
		session.close();
	}

	public void updateRepuesto(Repuestos repuesto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(repuesto);
		tx.commit();
		session.close();		
	}

	@Transactional
	public void removeRepuesto(long patente) {
		Session session = sessionFactory.openSession();
		Repuestos d = session.get(Repuestos.class, patente);
		Transaction tx = session.beginTransaction();
		session.delete(d);
		tx.commit();
		session.close();	
	}
}
