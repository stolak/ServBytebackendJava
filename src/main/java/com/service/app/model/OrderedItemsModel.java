package com.service.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_ITEMS")
public class OrderedItemsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int mealID;
	@Column
	private int userID;
	
	public OrderedItemsModel(int id, int mealID, int userID) {
		super();
		this.id = id;
		this.mealID = mealID;
		this.userID = userID;
	}
	
	public OrderedItemsModel() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMealID() {
		return mealID;
	}
	public void setMealID(int mealID) {
		this.mealID = mealID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	
}
