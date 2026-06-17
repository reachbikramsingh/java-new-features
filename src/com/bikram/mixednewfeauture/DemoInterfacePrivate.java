package com.bikram.mixednewfeauture;

public interface DemoInterfacePrivate {
	default void show() {
		System.out.println("Showing...");
	}
	private void demoPrivateMethod() {
		System.out.println("Demo private methods");
	}

}
