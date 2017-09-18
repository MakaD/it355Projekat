package com.marina.damnjanovic.data.models;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity
@Table(name="oglas")
public class AdModel {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	
	public String title;
	
	public String description;
	
	public String deadline;
	
	public String category;
	
	public String city;
	
	public String company;
	
	public AdModel() {
		
	}

	public AdModel(int id, String title, String description, String deadline, String category, String city,
			String company) {
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.category = category;
		this.city = city;
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "AdModel [title=" + title + ", description=" + description + ", deadline=" + deadline + ", category="
				+ category + ", city=" + city + ", company=" + company + "]";
	}
	
}
