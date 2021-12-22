package com.xworkz.stream1.cafe;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CafeMain {
	
	public static void main(String[] args ) {
		
		CafeDto dto=new CafeDto("Brewberry", "veg", "Ballari", 3.6f, 1);
		CafeDto dto1=new CafeDto("Cubes", "veg", "Ballari", 4.2f, 2);
		CafeDto dto2=new CafeDto("The illusion", "veg", "Bagalore", 4.0f,3);
		CafeDto dto3=new CafeDto("Tosta cafe", "veg", "Ballari", 4.3f, 4);
		
		Stream<CafeDto> se= Stream.of(dto, dto1,dto2,dto3);
		
		se.filter((e)->e.getRatings()>3).sorted((e,e1)->e1.getName().compareTo(e.getName())).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	}

	

}


