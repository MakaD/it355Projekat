package com.marina.damnjanovic.data.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marina.damnjanovic.data.models.AdModel;

@Repository
public class AdDAOImpl implements AdDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(AdDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	Session session = sessionFactory.getCurrentSession(); 
	Transaction tx = session.beginTransaction();

	
	@Override
	@Transactional
	public void addAd(AdModel ad) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(ad);
		logger.info("Ad saved successfully, Ad Details=" + ad);
	}

	@Override
	@Transactional
	public void updateAd(AdModel ad) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(ad);
		logger.info("Ad updated successfully, Ad Details=" + ad);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<AdModel> listAds() {
		Session session = this.sessionFactory.getCurrentSession();
		List<AdModel> adList = session.createQuery("from AdModel").list();
		for(AdModel ad : adList){
			logger.info("Ad List::" + ad);
		}
		return adList;
	}

	@Override
	@Transactional
	public AdModel getAdById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		AdModel ad = (AdModel) session.load(AdModel.class, new Integer(id));
		logger.info("Ad loaded successfully, Ad details=" + ad);
		return ad;
	}

	@Override
	@Transactional
	public void removeAd(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		AdModel ad = (AdModel) session.load(AdModel.class, new Integer(id));
		if(null != ad){
			session.delete(ad);
		}
		logger.info("Ad deleted successfully, Ad details=" + ad);
		
	}

}
