package com.xworkz.stream1.cafe;

import java.io.Serializable;

public class CafeDto implements Serializable {
       
	private String name;
	private String type;
	private String location;
	private float ratings;
	private int id;
	public CafeDto() {
}
public CafeDto(String name, String type, String location, float ratings, int id) {
	
	super();
	this.name = name;
	this.type = type;
	this.location = location;
	this.ratings = ratings;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "CafeDto [name=" + name + ", type=" + type + ", location=" + location + ", ratings=" + ratings + ", id=" + id + "]";
}

}