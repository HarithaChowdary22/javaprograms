package com.xworkz.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYear {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1998,1997,1996,1995,2000,
				                           2001,1994,1993,1991,2002,
				                           2003,2004,2005,1990,2006);
		List<Integer> list= stream.filter((year)->year>1999).sorted().collect(Collectors.toList());
		list.forEach((Year)->System.out.println(Year));
				                              
	}

}
