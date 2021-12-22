package com.xworkz.stream1.Temple;

public class TempleDto {
	
	private String name;
	private String famousGod;
	private int noOfVisitors;
	private String location;
	
	public TempleDto(String name, String famousGod, int noOfVisitors, String location) {
		super();
		this.name = name;
		this.famousGod = famousGod;
		this.noOfVisitors = noOfVisitors;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamousGod() {
		return famousGod;
	}
	public void setFamousGod(String famousGod) {
		this.famousGod = famousGod;
	}
	public int getNoOfVisitors() {
		return noOfVisitors;
	}
	public void setNoOfVisitors(int noOfVisitors) {
		this.noOfVisitors = noOfVisitors;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "TempleDto [name=" + name + ", famousGod=" + famousGod + ", noOfVisitors=" + noOfVisitors + ", location="
				+ location + "]";
	}
	

}
