package com.bikram.designpattern;
public class SingaleTon {
	private static SingaleTon instance;

	public SingaleTon() {

	}
	
	private static SingaleTon getInstance(){
		
		
		if(instance==null) {
			instance=new SingaleTon();
		}
		return instance;
	}
	
}