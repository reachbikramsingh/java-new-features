package com.bikram.lambdaexpression;

public class TwoMethodTestDemo {
public static void main(String[] args) {
	//TwoMethodTest test=(int a)->System.out.println("Checking squre"+(2*2));
	TwoMethodTest fobj = (int x) -> System.out.println(2 * x);
     fobj.sendValue(9);
}
}
