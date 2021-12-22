package com.xworkz.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNo {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(101,203,103,104,105,106,109,108,107,110,202,203,204,205,206,209,208,203,201,220);
		List<Integer> list = stream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		list.forEach((roll)->System.out.println(roll));
	}
}
