package com.xworkz.jdbc1;

public class TrainDTO {

	private int tid;
	private int trainNo;
	private String boarding;
	private String destination;
	private int seatNo;
	private int price;
	private String tClass;
	private String name;
	
	
       public TrainDTO() {
		
	}
	
	
	
	public TrainDTO(int tid, int trainNo, String boarding, String destination, int seatNo, int price, String tClass,
			String name) {
		super();
		this.tid = tid;
		this.trainNo = trainNo;
		this.boarding = boarding;
		this.destination = destination;
		this.seatNo = seatNo;
		this.price = price;
		this.tClass = tClass;
		this.name = name;
	}



	public void setTid(int tid) {
		this.tid = tid;
	}



	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}



	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public void settClass(String tClass) {
		this.tClass = tClass;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getTid() {
		return tid;
	}



	public int getTrainNo() {
		return trainNo;
	}



	public String getBoarding() {
		return boarding;
	}



	public String getDestination() {
		return destination;
	}



	public int getSeatNo() {
		return seatNo;
	}



	public int getPrice() {
		return price;
	}



	public String gettClass() {
		return tClass;
	}



	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "TrainDTO [tid=" + tid + ", trainNo=" + trainNo + ", boarding=" + boarding + ", destination="
				+ destination + ", seatNo=" + seatNo + ", price=" + price + ", tClass=" + tClass + ", name=" + name
				+ "]";
	}
	
}
