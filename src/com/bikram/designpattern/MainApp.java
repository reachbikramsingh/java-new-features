package com.bikram.designpattern;
public class MainApp {

    public static void main(String[] args) {

        UserService service = new UserService();

        service.insertUser("Bikram");
        service.insertUser("Rahul");
    }
}