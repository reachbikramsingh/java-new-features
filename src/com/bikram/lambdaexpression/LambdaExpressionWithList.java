package com.bikram.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionWithList {
//	public static void main(String[] args) {
//		List<String> values=new ArrayList<>();
//		values.add("Bikram");
//		values.add("Ravi");
//		values.add("Rohit");
//		values.add("Arnit");
//		
//		System.out.println("all Names :: ");
//		values.forEach(value ->System.out.println( value));
//		
//		System.out.println("\n names starting with 'A':");
//		values.stream()
//		.filter(val ->val.startsWith("A"))
//		.map(val-> val.toUpperCase()).forEach(System.out.println());
//		//.forEach();
//		
//	}
public static void main(String[] args){
        
       // List<String> names = Arrays.asList( "Arnit", "Bob", "Charlie", "Adam");
        
		List<String> names=new ArrayList<>();
		names.add("Bikram");
		names.add("Ravi");
		names.add("Rohit");
		names.add("Arnit");

        System.out.println("All names:");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nNames starting with 'A':");
        names.stream()
            .filter(n -> n.startsWith("A"))
            .map(n -> n.toUpperCase())
            .forEach(System.out::println);
    }
}
