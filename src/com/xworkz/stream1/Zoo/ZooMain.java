package com.xworkz.stream1.Zoo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooMain {
	
	public static void main(String[] args) {
		
		ZooDto zoo=new ZooDto("Lion Safari", 3, "Shivamogga", 200.00f);
		ZooDto zoo1=new ZooDto("Horsley Hill Zoo", 4, "Andrapradesh", 300.00f);
		ZooDto zoo2=new ZooDto("Indira Gandhi Zoo", 5, "Vishakapatnam", 400.00f);
		ZooDto zoo3=new ZooDto("Bannerugatta", 6, "Bangalore", 200.00f);
		
		System.out.println("-------Looping by id<5 and sorting by price in ascending order--------");
		
		Stream<ZooDto> str=Stream.of(zoo,zoo1,zoo2,zoo3);
		
		str.filter((e)->e.getId()<5).sorted((e,e1)->e.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
		
		
	}

}
