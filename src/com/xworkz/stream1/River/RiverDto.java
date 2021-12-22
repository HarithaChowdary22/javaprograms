package com.xworkz.stream1.River;

import java.io.Serializable;

public class RiverDto implements Serializable{ 
	
	private String name;
	private String place;
	private Integer longer;
	private String bornAt;
	public RiverDto(String name, String place, Integer longer, String bornAt) {
		super();
		this.name = name;
		this.place = place;
		this.longer = longer;
		this.bornAt = bornAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getLonger() {
		return longer;
	}
	public void setLonger(Integer longer) {
		this.longer = longer;
	}
	public String getBornAt() {
		return bornAt;
	}
	public void setBornAt(String bornAt) {
		this.bornAt = bornAt;
	}
	@Override
	public String toString() {
		return "RiverDto [name=" + name + ", place=" + place + ", longer=" + longer + ", bornAt=" + bornAt + "]";
	}
	
	

}
