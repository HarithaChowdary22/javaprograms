package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Area {

	public static void main(String[] args) {
		
		Map<String, Integer> areaMap = new HashMap<String, Integer>();
		areaMap.put("Karanatak", 191791);
		areaMap.put("Rajasthan", 342293);
		areaMap.put("Gujarat", 196024);
		areaMap.put("Uttarakhand", 53483);
		areaMap.put("Punjab", 50362);
		
		Set<String> set = areaMap.keySet();
		set.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection = areaMap.values();
		collection.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries = areaMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		

		System.out.println("\n");
		System.out.println("After Asending");
		System.out.println("=============================================================");
		
		Map<String, Integer> areaMa = new TreeMap<String, Integer>((e,e1)->e.compareTo(e1));
		areaMa.put("Karanatak", 191791);
		areaMa.put("Rajasthan", 342293);
		areaMa.put("Gujarat", 196024);
		areaMa.put("Uttarakhand", 53483);
		areaMa.put("Punjab", 50362);
		
		Set<String> set2 = areaMa.keySet();
		set2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection2 = areaMa.values();
		collection2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries2 = areaMa.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = entries2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("\n");
		System.out.println("After Descending");
		System.out.println("=============================================================");
		
		Map<String, Integer> area = new TreeMap<String, Integer>((e,e1)->e1.compareTo(e));
		area.put("Karanatak", 191791);
		area.put("Rajasthan", 342293);
		area.put("Gujarat", 196024);
		area.put("Uttarakhand", 53483);
		area.put("Punjab", 50362);
		
		Set<String> set3 = area.keySet();
		set3.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection3 = area.values();
		collection3.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries3 = area.entrySet();
		Iterator<Entry<String, Integer>> iterator3 = entries3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<String, Integer> entry = iterator3.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
