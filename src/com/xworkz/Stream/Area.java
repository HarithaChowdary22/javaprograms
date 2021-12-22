package com.xworkz.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Area {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Royal circle","Mothi circle","Sungam circle","SP circle","Rajkumar road",
				 "Bypass road","Banglore road","Avambhavi","Moka road", "Jain nagar",
				 "ABVL road","Gandhi nagar","Cantonement","Rajajinagar","BTM layout",
				 "Rajarajeawari","Jayanagar","yashwanthpura","Electronic city","Hebbal");
		List<String> list = stream.map(String::toLowerCase).sorted().collect(Collectors.toList());
		list.forEach((area)->System.out.println(area));
		System.out.println();
		
		Stream<String> stream1 = Stream.of("Royal circle","Mothi circle","Sungam circle","SP circle","Rajkumar road",
				 "Bypass road","Banglore road","Avambhavi","Moka road", "Jain nagar",
				 "ABVL road","Gandhi nagar","Cantonement","Rajajinagar","BTM layout",
				 "Rajarajeawari","Jayanagar","yashwanthpura","Electronic city","Hebbal");
		List<String> list1 = stream1.map(String::toLowerCase).sorted().collect(Collectors.toList());
		list1.forEach((area)->System.out.println(area));
		System.out.println();

		
	}

}
