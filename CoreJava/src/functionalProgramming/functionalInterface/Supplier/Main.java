package functionalProgramming.functionalInterface.Supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

            // Supplier
            // Supplier is a functional interface.
            // Supplier is used to supply a value.
            // Supplier have a method get() which takes no argument and returns a value.

            Supplier<String> s = () -> "Hello";
            System.out.println(s.get());

            Supplier<Double> s2 = () -> Math.random();
            System.out.println(s2.get());

            Supplier<Integer> s3 = () -> 10;
            System.out.println(s3.get());

            Supplier<String> s4 = () -> {
                String otp = "";
                for (int i = 0; i < 6; i++) {
                    otp = otp + (int) (Math.random() * 10);
                }
                return otp;
            };
            System.out.println(s4.get());
    }
}
