package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class States {

	public static void main(String[] args) {
		
		Map<String, Integer> stateMap = new HashMap<String, Integer>();
		stateMap.put("KARANATAKA", 1);
		stateMap.put("ANDAMAN AND NICOBAR ISLANDS", 3);
		stateMap.put("ANDHRA PRADESH", 13);
		stateMap.put("ARUNACHAL PRADESH", 25);
		stateMap.put("ASSAM", 33);
		stateMap.put("BIHAR", 38);
		stateMap.put("DELHI", 11);
		stateMap.put("GOA", 2);
		stateMap.put("CHANDIGARH", 1);
		stateMap.put("CHHATTISGARH", 28);
		stateMap.put("WEST BENGAL", 23);
		stateMap.put("TRIPURA", 8);
		stateMap.put("UTTARAKHAND", 13);
		stateMap.put("PUDUCHERRY", 4);
		stateMap.put("UTTAR PRADESH", 75);
		stateMap.put("TELANGANA", 33);
		stateMap.put("SIKKIM", 4);
		stateMap.put("PUNJAB", 23);
		stateMap.put("RAJASTHAN", 33);
		stateMap.put("TAMIL NADU", 38);
		stateMap.put("NAGALAND", 12);
		
		Set<String> keys= stateMap.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String map = itr.next();
			System.out.println(map);
		}
		System.out.println("\n");
		Collection<Integer> values =  stateMap.values();
		Iterator<Integer> itrr = values.iterator();
		while (itrr.hasNext()) {
			Integer maps = itrr.next();
			System.out.println(maps);
		}
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> both =  stateMap.entrySet();
		Iterator<Map.Entry<String, Integer>> both1 = both.iterator();
		while (both1.hasNext()) {
			Map.Entry<String, Integer> entry = both1.next();
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}

		System.out.println("\n");
		System.out.println("After Asending");
		System.out.println("=============================================================");
		
		Map<String, Integer> state =new TreeMap<String, Integer>((ele1, ele2)->ele1.compareTo(ele2));
		
		state.put("KARANATAKA", 1);
		state.put("ANDAMAN AND NICOBAR ISLANDS", 3);
		state.put("ANDHRA PRADESH", 13);
		state.put("ARUNACHAL PRADESH", 25);
		state.put("ASSAM", 33);
		state.put("BIHAR", 38);
		state.put("DELHI", 11);
		state.put("GOA", 2);
		state.put("CHANDIGARH", 1);
		state.put("CHHATTISGARH", 28);
		state.put("WEST BENGAL", 23);
		state.put("TRIPURA", 8);
		state.put("UTTARAKHAND", 13);
		state.put("PUDUCHERRY", 4);
		state.put("UTTAR PRADESH", 75);
		state.put("TELANGANA", 33);
		state.put("SIKKIM", 4);
		state.put("PUNJAB", 23);
		state.put("RAJASTHAN", 33);
		state.put("TAMIL NADU", 38);
		state.put("NAGALAND", 12);
		
		Set<String> key= state.keySet();
		Iterator<String> i = key.iterator();
		while(i.hasNext()) {
			String map = i.next();
			System.out.println(map);
		}
		System.out.println("\n");
		Collection<Integer> value =  state.values();
		Iterator<Integer> it = value.iterator();
		while (it.hasNext()) {
			Integer ma = it.next();
			System.out.println(ma);
		}
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> both2 =  state.entrySet();
		Iterator<Map.Entry<String, Integer>> both3 = both2.iterator();
		while (both3.hasNext()) {
			Map.Entry<String, Integer> entr = both3.next();
			System.out.println(entr.getKey()+ " " + entr.getValue());
		}
		
		System.out.println("\n");
		System.out.println("After Desending");
		System.out.println("=============================================================");
		
		Map<String, Integer> sta =new TreeMap<String, Integer>((ele1, ele2)->ele2.compareTo(ele1));
		
		sta.put("KARANATAKA", 1);
		sta.put("ANDAMAN AND NICOBAR ISLANDS", 3);
		sta.put("ANDHRA PRADESH", 13);
		sta.put("ARUNACHAL PRADESH", 25);
		sta.put("ASSAM", 33);
		sta.put("BIHAR", 38);
		sta.put("DELHI", 11);
		sta.put("GOA", 2);
		sta.put("CHANDIGARH", 1);
		sta.put("CHHATTISGARH", 28);
		sta.put("WEST BENGAL", 23);
		sta.put("TRIPURA", 8);
		sta.put("UTTARAKHAND", 13);
		sta.put("PUDUCHERRY", 4);
		sta.put("UTTAR PRADESH", 75);
		sta.put("TELANGANA", 33);
		sta.put("SIKKIM", 4);
		sta.put("PUNJAB", 23);
		sta.put("RAJASTHAN", 33);
		sta.put("TAMIL NADU", 38);
		sta.put("NAGALAND", 12);
		
		Set<String> keyss= sta.keySet();
		Iterator<String> ii = keyss.iterator();
		while(ii.hasNext()) {
			String mapy = ii.next();
			System.out.println(mapy);
		}
		System.out.println("\n");
		Collection<Integer> valuess =  sta.values();
		Iterator<Integer> itt = valuess.iterator();
		while (itt.hasNext()) {
			Integer m = itt.next();
			System.out.println(m);
		}
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> bot =  sta.entrySet();
		Iterator<Map.Entry<String, Integer>> bo = bot.iterator();
		while (bo.hasNext()) {
			Map.Entry<String, Integer> ent = bo.next();
			System.out.println(ent.getKey()+ " " + ent.getValue());
		}
	}
}
