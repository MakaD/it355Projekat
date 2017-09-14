package com.marina.damnjanovic.data.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marina.damnjanovic.data.dao.AdDAO;
import com.marina.damnjanovic.data.models.AdModel;

public class AdServiceImpl implements AdService{
	
	private AdDAO adDAO;

	public void setAdDAO(AdDAO adDAO) {
		this.adDAO = adDAO;
	}

	@Override
	@Transactional
	public void addAd(AdModel ad) {
		this.adDAO.addAd(ad);
		
	}

	@Override
	@Transactional
	public void updateAd(AdModel ad) {
		this.adDAO.updateAd(ad);
		
	}

	@Override
	@Transactional
	public List<AdModel> listAds() {
		return this.adDAO.listAds();
	}

	@Override
	@Transactional
	public AdModel getAdById(int id) {
		return this.adDAO.getAdById(id);
	}

	@Override
	@Transactional
	public void removeAd(int id) {
		this.adDAO.removeAd(id);
		
	}
	
}
