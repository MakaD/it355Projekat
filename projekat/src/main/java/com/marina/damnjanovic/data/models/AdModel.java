package com.marina.damnjanovic.data.models;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity
@Table(name="proizvod")
public class AdModel {

	@Id
	@Column(name="id_komponente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;
	
	@Column(name="title")
	public String title;
	
	@Column(name="description")
	public String desription;
	
	@Column(name="deadline")
	public String deadline;
	
	@Column(name="category")
	public String category;
	
	@Column(name="city")
	public String city;
	
	@Column(name="company")
	public String company;
	
	public AdModel() {
		
	}

	public AdModel(int id, String title, String desription, String deadline, String category, String city,
			String company) {
		this.title = title;
		this.desription = desription;
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

	public String getDesription() {
		return desription;
	}

	public void setDesription(String desription) {
		this.desription = desription;
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
		return "AdModel [title=" + title + ", desription=" + desription + ", deadline=" + deadline + ", category="
				+ category + ", city=" + city + ", company=" + company + "]";
	}
	
}
