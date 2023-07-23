package functionalProgramming.functionalInterface.Function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

            // Function
            // Function is a functional interface.
            // Function is used to map an input to an output.
            // Function have a method apply() which takes an argument and returns a value.

            Function<String, Integer> f = s -> s.length();
            System.out.println(f.apply("abcdef"));

            Function<Integer, Integer> f2 = i -> i*i;
            System.out.println(f2.apply(10));

            Function<String, String> f3 = s -> s.toUpperCase();
            System.out.println(f3.apply("abcdef"));

            Function<String, String> f4 = s -> s.substring(0, 5);
            System.out.println(f4.apply("abcdef"));

            Function<Integer, Integer> f5 = i -> i*i*i;
            System.out.println(f5.apply(10));
    }
}
