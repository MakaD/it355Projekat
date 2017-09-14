package com.marina.damnjanovic.data.dao;

import java.util.List;
import com.marina.damnjanovic.data.models.AdModel;

public interface AdDAO {

	public void addAd(AdModel ad);
	public void updateAd(AdModel ad);
	public List<AdModel> listAds();
	public AdModel getAdById(int id);
	public void removeAd(int id);
	
}
