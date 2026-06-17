package com.bikram.collectionconceptmap;
//Maintains insertion order

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap< Integer, String> map=new LinkedHashMap<>();
		map.put(100, "bikram");
		map.put(101, "Viraj");
		map.put(102, "Nidhi");
		System.out.println(map);
	}
}
