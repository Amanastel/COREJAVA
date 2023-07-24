package functionalProgramming.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // StreamAPI
        // StreamAPI is a new feature in Java 8. It is used to process a collection of objects.
        // It is used to iterate, filter and extract data from collection.
        // It is used to perform aggregate operations on data returned from collections.
        // It is used to return a stream of data from a collection.
        // It is used to return a stream of data based on the condition applied on a collection.
        // It is used to return a stream of data based on the condition applied on a collection.
        // It is used to return a stream of data based on the condition applied on a collection.
        // It is used to return a stream of data based on the condition applied on a collection.
        // It is used to return a stream of data based on the condition applied on a collection.
        // It is used to return a stream of data based on the condition applied on a collection.
        // It is used to return a stream of data based on the condition applied on a collection.
        // It is used to return a stream of data based on the condition applied on a collection.

        // StreamAPI is used to process a collection of objects.
        // StreamAPI is used to iterate, filter and extract data from collection.
        // StreamAPI is used to perform aggregate operations on data returned from collections.
        // StreamAPI is used to return a stream of data from a collection.
        // StreamAPI is used to return a stream of data based on the condition applied on a collection.
        // StreamAPI is used to return a stream of data based on the condition applied on a collection.
        // StreamAPI is used to return a stream of data based on the condition applied on a collection.
        // StreamAPI is used to return a stream of data based on the condition applied on a collection.
        // StreamAPI is used to return a stream of data based on the condition applied on a collection.
        // StreamAPI is used to return a stream of data based on the condition applied on a collection.

        // StreamAPI is used to process a collection of objects.
        // StreamAPI is used to iterate, filter and extract data from collection.
        // StreamAPI is used to perform aggregate operations on data returned from collections.
        // StreamAPI is used to return a stream of data from a collection.
        // StreamAPI is used to return


        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        List<Integer> n =  numbers.stream().filter(e -> e%2==0 ).collect(Collectors.toList());
        System.out.println(n);

        List<Integer> gt50 = numbers.stream().filter(e -> e>10).collect(Collectors.toList());
        numbers.stream().filter(e -> e>10).forEach(e -> System.out.print(e+" "));
        System.out.println();
        System.out.println(gt50);
    }
}
