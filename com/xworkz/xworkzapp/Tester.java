
	package com.xworkz.xworkzapp;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Set;


	public class Tester {
		public static void main(String a[]) {
			List list = new ArrayList();
			list.add("as");
			list.add("we");
			list.add("are");
			list.add(null);
			
			System.out.println("forward direction data");
			ListIterator it = list.listIterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				Object obj = it.next();
				
				Iterator itr = list.iterator();
				while(itr.hasNext()) {
					String data = (String)itr.next();
				}
			}
			Set set = new HashSet();
			    set.add("are");
			    set.add("we");
			    Iterator iterator = set.iterator();
			    while(iterator.hasNext()) {
			    	
			    }
		}

	}


