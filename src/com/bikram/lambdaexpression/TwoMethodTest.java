package com.bikram.lambdaexpression;

public interface TwoMethodTest {
	void sendValue(int a);
	
	default void demo() {
		System.out.println("From DEMo");
	}

}
