package com.xworkz.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Atmpin {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1234,1238,4658,6584,4537,
				                        2548,7956,8056,7045,6593,
				                        8670,0574,7073,6703,8562,
				                        8592,5067,9461,8683,6094);
		List<Integer> list = stream.filter((pin)->pin>3000).collect(Collectors.toList());
		list.forEach((pin)->System.out.println(pin));
		
	}

}
