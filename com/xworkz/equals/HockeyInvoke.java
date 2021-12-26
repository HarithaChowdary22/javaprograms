package com.xworkz.equals;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class HockeyInvoke {
	public static void main(String[] args) {
		HockeyDTO dto1 =new HockeyDTO("Detroit Red Wings",78,42,"newzealand");
		HockeyDTO dto2 =new HockeyDTO("Calgary Flames",76,23,"india");
		HockeyDTO dto3 =new HockeyDTO("Buffalo Sabres",78,42,"swizerland");

		Set<HockeyDTO> dtos=new LinkedHashSet<HockeyDTO>();
		dtos.add(dto3);
		dtos.add(dto2);
		dtos.add(dto1);

		boolean b= dto2.equals(dto1);
		System.out.println(b);

		Optional<HockeyDTO> optional =dtos.stream().filter((e)->e.getWins()>30).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);


	}

}
