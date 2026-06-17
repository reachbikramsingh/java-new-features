package com.bikram.mixednewfeauture;
interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default Method");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}

public class PrivateMethodsExample {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {};
        myInterface.defaultMethod();
    }
}