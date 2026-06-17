package com.bikram.mixednewfeauture;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionsExample {
	public static void main(String[] args) {
		List<String> list=List.of("A","b","C");
		System.out.println(list);
		
		Set<String> setDemo=Set.of("A","B","C","D");
		System.out.println("SetDomo::"+setDemo);
		
		Map<String,Integer> mapDemo=Map.of("One", 1, "Two", 2);
		System.out.println("mapDemo"+mapDemo);
  }

}
