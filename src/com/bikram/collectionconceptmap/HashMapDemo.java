package com.bikram.collectionconceptmap;

import java.util.HashMap;

/*Features:
No order guarantee
Fast (O(1))
Allows one null key*/

public class HashMapDemo {
	//BiConsumer<T, U> c;
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap();
	map.put(100, "bikram");
	map.put(101, "Viraj");
	map.put(102, "Nidhi");
	
	  System.out.println(map);
	
}
}
