package functionalProgramming.functionalInterface.Predicates;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Predicate
        // Predicate is a functional interface.
        // Predicate is used to check a condition and return a boolean value.
        // Predicate have a method test() which takes an argument and returns a boolean value.

        Predicate<String> p = s -> s.length()>5;
        System.out.println(p.test("abcdef"));

    }
}
