package com.bikram.mixednewfeauture;

import java.util.Optional;

public class OptionalImprovementsExample {
	public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Java 9");

        // ifPresentOrElse example
        optionalValue.ifPresentOrElse(
            value -> System.out.println("Value: " + value),
            () -> System.out.println("Value not present")
        );

        // or example
        Optional<String> alternative = optionalValue.or(() -> Optional.of("Alternative"));
        System.out.println("Alternative: " + alternative.get());

        // stream example
        optionalValue.stream().forEach(System.out::println);
    }

}
