package com.accenture.tpfinal.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.tpfinal.model.Auto;


public class AutoDAO implements IAutoDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public Auto getAuto(Long patente) {
		Session session = sessionFactory.openSession();
		Auto auto = (Auto) session.load(Auto.class, patente);
		session.close();
		return auto;
	}

	public List<Auto> listAuto() {
		Session session = sessionFactory.openSession();
		List<Auto> listaAutos = session.createQuery("from Auto").list();
		session.close();
		return listaAutos;
	}
	@Transactional
	public void addAuto(Auto auto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(auto);
		tx.commit();
		session.close();
	}

	public void updateAuto(Auto auto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(auto);
		tx.commit();
		session.close();		
	}

	@Transactional
	public void removeAuto(long patente) {
		Session session = sessionFactory.openSession();
		Auto d = session.get(Auto.class, patente);
		Transaction tx = session.beginTransaction();
		session.delete(d);
		tx.commit();
		session.close();	
	}
	
	

}
