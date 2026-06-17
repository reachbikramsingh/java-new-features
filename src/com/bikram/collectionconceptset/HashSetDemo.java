package com.bikram.collectionconceptset;

import java.util.HashSet;
import java.util.Set;

/*No order guarantee
Fast performance (O(1))
Allows one null*/
public class HashSetDemo {
public static void main(String[] args) {
	//Set<String> set= Set.of("Bikram","Tanay","Nidhi","Bikram");
	Set<String> set= Set.of("Bikram","Tanay","Nidhi");
	//set.forEach(System.out::println);
	HashSet hset=new HashSet();
	hset.add("Bikram");
	hset.add("Raj");
	hset.add("tanay");
	hset.add("");
	hset.forEach(System.out::println);
	
	
}
}
