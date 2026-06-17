package com.bikram.collectionconceptlist;

import java.util.Vector;

/*Maintains insertion order and allows duplicate and null values.
Dynamically grows its size when capacity is exceeded.
Implements List, RandomAccess, Cloneable, and Serializable interfaces.
Vector is a Legacy class that was introduced in early versions of Java.
Thread-safe: All methods are synchronized for safe multi-threaded access.*/
public class VectorDemo {
public static void main(String[] args) {
	Vector<String> vector = new Vector<>();
	vector.add("Bikram");
	vector.add("Ravi");
	vector.forEach(System.out::println);
	
}
}
