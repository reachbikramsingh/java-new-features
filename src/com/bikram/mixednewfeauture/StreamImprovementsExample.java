package com.bikram.mixednewfeauture;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImprovementsExample {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(1,2,3,4,5,6,7,8,9);
		
		//takewhile example
		
		List<Integer> taken=numbers.stream()
				.takeWhile(n -> n < 5)
				.collect(Collectors.toList());
		System.out.println("takeWhile: " + taken);
		
		 // dropWhile example
        List<Integer> dropped = numbers.stream()
                                       .dropWhile(n -> n < 5)
                                       .collect(Collectors.toList());
        System.out.println("dropWhile: " + dropped);
        
        // iterate example
        Stream<Integer> iterated = Stream.iterate(0, n -> n < 10, n -> n + 2);
        iterated.forEach(System.out::println);
	}

}
