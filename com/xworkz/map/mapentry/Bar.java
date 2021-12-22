package com.xworkz.map.mapentry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Bar {

	public static void main(String[] args) {
		
		Map<String, Integer>  barMap = new HashMap<String, Integer>();
		barMap.put("The Underpass Pub & Grub", 90);
		barMap.put("Arbor Brewing Company", 85);
		barMap.put("Toit", 80);
		barMap.put("Skyye", 78);
		barMap.put("High Ultra Lounge", 74);
		barMap.put("Hoppipola", 50);
		
		Set<String> set =  barMap.keySet();
		set.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection =  barMap.values();
		collection.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries = barMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("\n");
		System.out.println("After Asending");
		System.out.println("=============================================================");
		
		Map<String, Integer>  barMa = new TreeMap<String, Integer>((e,e1)->e.compareTo(e1));
		barMa.put("The Underpass Pub & Grub", 90);
		barMa.put("Arbor Brewing Company", 85);
		barMa.put("Toit", 80);
		barMa.put("Skyye", 78);
		barMa.put("High Ultra Lounge", 74);
		barMa.put("Hoppipola", 50);
		
		Set<String> set2 = barMa.keySet();
		set2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection2 = barMa.values();
		collection2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries2 = barMa.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = entries2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		

		System.out.println("\n");
		System.out.println("After Descending");
		System.out.println("=============================================================");
		
		Map<String, Integer>  bar = new TreeMap<String, Integer>((e,e1)->e1.compareTo(e));
		bar.put("The Underpass Pub & Grub", 90);
		bar.put("Arbor Brewing Company", 85);
		bar.put("Toit", 80);
		bar.put("Skyye", 78);
		bar.put("High Ultra Lounge", 74);
		bar.put("Hoppipola", 50);
		
		Set<String> set3 = bar.keySet();
		set3.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection3 = bar.values();
		collection3.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries3 = bar.entrySet();
		Iterator<Entry<String, Integer>> iterator3 = entries3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<String, Integer> entry = iterator3.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
