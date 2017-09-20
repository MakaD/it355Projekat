package com.marina.damnjanovic.data.services;

import java.util.List;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marina.damnjanovic.data.dao.AdDAO;
import com.marina.damnjanovic.data.models.AdModel;

@Service
public class AdServiceImpl implements AdService{
	
	@Autowired
	private AdDAO adDAO;

	public void setAdDAO(AdDAO adDAO) {
		this.adDAO = adDAO;
	}
	
	@Transactional
	public void addAd(AdModel ad) {
		this.adDAO.addAd(ad);
		
	}

	@Transactional
	public void updateAd(AdModel ad) {
		this.adDAO.updateAd(ad);
		
	}

	@Transactional
	public List<AdModel> listAds() {
		return this.adDAO.listAds();
	}

	@Transactional
	public AdModel getAdById(int id) {
		return this.adDAO.getAdById(id);
	}

	@Transactional
	public void removeAd(int id) {
		this.adDAO.removeAd(id);
		
	}
	
}
