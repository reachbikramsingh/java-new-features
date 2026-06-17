package com.bikram.collectionconceptset;
/*Features:
Sorted (natural order)
Does NOT allow null
Slower (O(log n))*/

import java.util.TreeSet;

public class TreeSetDemo{
	public static void main(String[] args) {
		TreeSet treeset=new TreeSet();
		treeset.add("Bikram");
		treeset.add("Sandeep");
		treeset.add("Viraj");
		treeset.add("Tanay");
		
		treeset.forEach(System.out::println);
		
	}

}
