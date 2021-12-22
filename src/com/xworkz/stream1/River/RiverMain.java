package com.xworkz.stream1.River;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverMain {
	public static void main(String[] args) {
		
		RiverDto dto=new RiverDto("Tunga", "Karnataka", 147, "Chikkamangaluru");
		RiverDto dto1=new RiverDto("Krishna", "Telangana", 1400, "Hyderabad" );
		RiverDto dto2=new RiverDto("Chitravathi", "Andra Pradesh", 205, "Anantapur");
		RiverDto dto3=new RiverDto("Yamuna", "India", 1376, "Uttarkshi");
		RiverDto dto4=new RiverDto("kaveri", "Karnataka", 804, "Talakaver");
		
		Stream<RiverDto> str=Stream.of(dto,dto1,dto2,dto3,dto4);
		
		System.out.println("------.-Filterd by where length >100 and sorted in descending order");
		str.filter((dt)->dt.getLonger()>500).sorted((dt1,dt2)->dt1.getLonger().compareTo(dt2.getLonger())).collect(Collectors.toList()).forEach((r)->System.out.println(r));
		
		System.out.println("----sorted in desending order------");
		Stream<RiverDto> str1=Stream.of(dto,dto1,dto2,dto3,dto4);
		str1.filter((dt)->dt.getLonger()>500).sorted((dt1,dt2)->dt1.getLonger().compareTo(dt2.getLonger())).collect(Collectors.toList()).forEach((r)->System.out.println(r));
	}

}
