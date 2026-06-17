package com.bikram.collectionconceptmap;

import java.util.TreeMap;

/*Sorted by key
No null key
Slower (O(log n))*/
public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap< Integer, String> map=new TreeMap<>();
	map.put(101, "bikram");
	map.put(100, "Viraj");
	map.put(102, "Nidhi");
	
	System.out.println(map);
}
}