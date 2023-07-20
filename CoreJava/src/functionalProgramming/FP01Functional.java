package functionalProgramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    public static void print(int number){
        System.out.println(number);
    }

    public static boolean isEven(int number){
        return number%2==0;
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

//        for(int number: numbers) System.out.print(number+" ");
//
//        System.out.println();
//
//        numbers.forEach((e) -> System.out.print(e+" "));


//        numbers.stream()
//                .forEach(FP01Functional::print);

        numbers.stream()
//                .filter(FP01Functional::isEven)
//                .filter((e) -> e%2==0)
                .filter(e -> e%2==0)  // Lambda Expression
                .forEach(System.out::println);  // method reference
    }
}
