package com.xworkz.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNR {

	public static void main(String[] args) {
		Stream<Long> stream = Stream.of(8088470016L,7338256663L,9108114829L,9481047800L,9480178562L,
				                        8765432897L,6753425647L,5647382364L,5563771618L,2534467588L,
				                        9864764585L,2534767857L,5467638276L,5690737623L,5364782674L,
				                        5438364882L,5489782788L,4655883877L,3647882983L,5374958857L);
		List<Long> list = stream.filter((pnr)->pnr>5000000000L).sorted().collect(Collectors.toList());
		list.forEach((l)->System.out.println(l));
	}
}

