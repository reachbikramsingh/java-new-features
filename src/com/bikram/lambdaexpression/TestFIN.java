package com.bikram.lambdaexpression;

public class TestFIN {
public static void main(String[] args) {
	Add addVar=(a, b) -> a + b;
	int result=addVar.addition(12, 34);
	System.out.println("Addition is   ::: "+result);
}
}
