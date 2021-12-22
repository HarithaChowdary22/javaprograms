package com.xworkz.stream1.Zoo;

import java.io.Serializable;

public class ZooDto implements Serializable {
	
	private String name;
	private int id;
	private String place;
	private Float ticketPrice;
	public ZooDto(String name, int id, String place, Float ticketPrice) {
		super();
		this.name = name;
		this.id = id;
		this.place = place;
		this.ticketPrice = ticketPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Float getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "ZooDto [name=" + name + ", id=" + id + ", place=" + place + ", ticketPrice=" + ticketPrice + "]";
	}
	

}
