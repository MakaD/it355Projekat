package com.marina.damnjanovic.data.services;

import java.util.List;

import com.marina.damnjanovic.data.models.AdModel;

public interface AdService {

	public void addAd(AdModel ad);
	public void updateAd(AdModel ad);
	public List<AdModel> listAds();
	public AdModel getAdById(int id);
	public void removeAd(int id);
	
}
