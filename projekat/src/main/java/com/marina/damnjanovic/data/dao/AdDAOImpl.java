package com.marina.damnjanovic.data.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.marina.damnjanovic.data.models.AdModel;

@Repository
public class AdDAOImpl implements AdDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(AdDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addAd(AdModel ad) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(ad);
		logger.info("Ad saved successfully, Ad Details=" + ad);
	}

	@Override
	public void updateAd(AdModel ad) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(ad);
		logger.info("Ad updated successfully, Ad Details=" + ad);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdModel> listAds() {
		Session session = this.sessionFactory.getCurrentSession();
		List<AdModel> adList = session.createQuery("from Person").list();
		for(AdModel ad : adList){
			logger.info("Ad List::" + ad);
		}
		return adList;
	}

	@Override
	public AdModel getAdById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		AdModel ad = (AdModel) session.load(AdModel.class, new Integer(id));
		logger.info("Ad loaded successfully, Ad details=" + ad);
		return ad;
	}

	@Override
	public void removeAd(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		AdModel ad = (AdModel) session.load(AdModel.class, new Integer(id));
		if(null != ad){
			session.delete(ad);
		}
		logger.info("Ad deleted successfully, Ad details=" + ad);
		
	}

}
