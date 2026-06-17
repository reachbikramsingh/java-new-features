package com.bikram.collectionconceptmap;
/*ConcurrentHashMap allows multiple threads 
to read and write simultaneously
without blocking the entire map.*/

import java.util.concurrent.ConcurrentHashMap;

public class ConcrentHashMAPTest {
public static void main(String[] args) {
	ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap<>();
	map.put(100, "bikram");
	map.put(101, "Viraj");
	map.put(102, "Nidhi");

	 // Here we cant add Hello because 101 key
    // is already present in ConcurrentHashMap object
    map.putIfAbsent(101, "Hello");

    // We can remove entry because 101 key
    // is associated with For value
    map.remove(101, "Viraj");

    // Now we can add Hello
    map.putIfAbsent(103, "Hello");

    // We cant replace Hello with For
    map.replace(101, "Hello", "For");
    System.out.println(map);
	
}
}