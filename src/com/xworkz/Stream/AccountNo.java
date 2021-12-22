package com.xworkz.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountNo {
	
	public static void main(String[] args) {
		Stream<Long> stream = Stream.of(435386623385648L,12345678934545L,45673824379465L,54668391245683L,54629553658945L,
				54637694635476L,65739664714375L,43518452759065L,13456556893453L,435205637563447L,
				32447684966313L,658295623456723L,34164866245756L,54820451345747L,13476934572348l,
				2316485548344L,12436784538653L,54672945365724L,65802456734567L,13567963756385L);
		List<Long> list = stream.collect(Collectors.toList());
		list.forEach((accno)->System.out.println(accno));
	}

}
