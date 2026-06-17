package com.bikram.designpattern;
public class Test {
public static void main(String[] args) {
	SingaleTon st=new SingaleTon();
	System.out.println(st.hashCode());
	SingaleTon st2=new SingaleTon();
	System.out.println(st2.hashCode());
}
}