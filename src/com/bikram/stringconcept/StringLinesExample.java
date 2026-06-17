package com.bikram.stringconcept;
public class StringLinesExample {
    public static void main(String[] args) {
        String str = "Java\n11\nFeatures";
        str.lines().forEach(System.out::println);
    }
}