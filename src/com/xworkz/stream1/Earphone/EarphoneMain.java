package com.xworkz.stream1.Earphone;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EarphoneMain {
	
	public static void main(String[] args) {
		
		EarphoneDto Ear=new EarphoneDto("Boat", 400, 14, "Wired");
		EarphoneDto Ear1=new EarphoneDto("Apple Earpords", 319, 123, "Bluetooth");
		EarphoneDto Ear2=new EarphoneDto("OnePlus Bullets", 1000, 124, "Wireless");
		EarphoneDto Ear3=new EarphoneDto("Redmi", 1500, 12, "Bluetooth" );
		EarphoneDto Ear4=new EarphoneDto("Samsung galaxy", 2000, 126, "Wireless");
		
		Stream<EarphoneDto> str=Stream.of(Ear,Ear1,Ear2,Ear3,Ear4);
		
		System.out.println("----------filter by where cost >500 and sorted by brand in ascending order-------");
		
		str.filter((e)->e.getCost()>500).sorted((e,e1)->e.getBrand().compareTo(e1.getBrand())).collect(Collectors.toList()).forEach((s)->System.out.println(s));

		System.out.println("--------print only models-------");
		Stream<EarphoneDto> str1=Stream.of(Ear,Ear1,Ear2,Ear3,Ear4);
		str1.sorted((e,e1)->e.getBrand().compareTo(e1.getBrand())).map((e)->e.getBrand()).collect(Collectors.toList()).forEach((s)->System.out.println(s));
	
	}

}
