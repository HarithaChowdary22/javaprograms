package com.xworkz.stream1.Earphone;

import java.io.Serializable;

public class EarphoneDto implements Serializable{
	
	private String brand;
	private float cost;
	private int id;
	private String type;
	public EarphoneDto(String brand, float cost, int id, String type) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.id = id;
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "EarphoneDto [brand=" + brand + ", cost=" + cost + ", id=" + id + ", type=" + type + "]";
	}
	
	
}


