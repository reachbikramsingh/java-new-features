package com.bikram.collectionconceptset;

import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());

	//printUpper.forEach();
}
}