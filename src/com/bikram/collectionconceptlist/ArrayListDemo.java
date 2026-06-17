package com.bikram.collectionconceptlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
public static void main(String[] args) {
	List<String> list=List.of("Bikram","raj","Tanay");
	//list.forEach(System.out::println);
	
	
//	Maintains insertion order
//	Allows duplicates
//	Fast random access (get/set)
//	Slow insertion/deletion in middle

	List<String> alist=new ArrayList<String>();
	alist.add("Arnit");
	alist.add("samit");
	alist.add("taj");
	alist.add("hyd");
	alist.add("delhi");
	
	alist.forEach(System.out::println);
}
}
