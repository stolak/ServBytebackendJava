package com.service.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class ItemsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int categoryId;
	@Column
	private String description;
	@Column
	private String preparationTime;
	@Column
	private double price;
	@Column
	private String picture;
	@Column
	private int serviceProviderId;
	public ItemsModel(int id, int categoryId,String description, String preparationTime, double price, String picture,
			int serviceProviderId) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.description = description;
		this.preparationTime = preparationTime;
		this.price = price;
		this.picture = picture;
		
		this.serviceProviderId = serviceProviderId;
	}
	
	public ItemsModel() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPreparationTime() {
		return preparationTime;
	}
	public void setPreparationTime(String preparationTime) {
		this.preparationTime = preparationTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getCategory() {
		return categoryId;
	}
	public void setCategory(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getServiceProvider() {
		return serviceProviderId;
	}
	public void setServiceProvider(int serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}
	
	
	
	
}
