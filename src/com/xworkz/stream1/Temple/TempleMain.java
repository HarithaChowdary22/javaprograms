package com.xworkz.stream1.Temple;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempleMain {
	
	public static void main(String[] args) {
		
		TempleDto dto=new TempleDto("Dharmastala", "Manjunatha Swamy", 1000000, "South Karnataka");
		TempleDto dto1=new TempleDto("Iskon", "Krishna", 10000, "Bangalore");
		TempleDto dto2=new TempleDto("Vidya Shankara", "Sharada", 100000, "Shringer");
		TempleDto dto3=new TempleDto("Murudeshwara", "Mahadeva", 1000000, "Mangaluru");
		TempleDto dto4=new TempleDto("Thirupathi", "Venkateshwara", 10000000, "Andrapradesh");
		
		Stream<TempleDto> str= Stream.of(dto,dto1,dto2,dto3,dto4);
		
		System.out.println("-------filter orderd by no of visitor>1000 and sort location bt ascending order------");
		
		str.filter((e)->e.getNoOfVisitors()>1000).sorted((a,a1)->a.getLocation().compareTo(a1.getLocation())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
	}

}
