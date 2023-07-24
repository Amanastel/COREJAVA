package functionalProgramming.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {


            // Stream
            // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
            // Stream is not a data structure.
            // Stream does not store elements.
            // Stream is functional in nature.
            // Stream is lazy and evaluates code only when required.
            // Stream is consumable, so once used it cannot be reused.
            // Stream is more declarative than imperative.

            // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
            // Stream is not a data structure.
            // Stream does not store elements.
            // Stream is functional in nature.
            // Stream is lazy and evaluates code only when required.
            // Stream is consumable, so once used it cannot be reused.
            // Stream is more declarative than imperative.

            // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
            // Stream is not a data structure.
            // Stream does not store elements.
            // Stream is functional in nature.
            // Stream is lazy and evaluates code only when required.
            // Stream is consumable, so once used it cannot be reused.
            // Stream is more declarative than imperative.

            // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
            // Stream is not a data structure.
            // Stream does not store elements.
            // Stream is functional in nature.
            // Stream is lazy and evaluates code only when required.
            // Stream is consumable, so once used it cannot be reused.
            // Stream is more declarative than imperative.

            // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
            // Stream is not a data structure.
            // Stream does not store elements.
            // Stream is functional in nature.
            // Stream is lazy and evaluates code only when required.
            // Stream is consumable, so once used it cannot be reused.
            // Stream is more declarative than imperative.

            // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
            // Stream is not a data structure.
            // Stream does not store elements.
            // Stream is functional in nature.
            // Stream is lazy and evaluates code only when required.
            // Stream is consumable, so once used it cannot be reused.
            // Stream is more declarative than imperative.

            // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
            // Stream is not a data structure.
            // Stream does not store elements.


        String[] name = {"aman", "amit", "ajay", "uttam", "divya", "abhinav", "abhi","durgesh","dinesh","deepak","dheeraj","dheeru","dheer","dheera","dheer"};

        Stream<String> s = Stream.of(name);

         s.filter(e -> e.charAt(0) == 'a').forEach(e -> System.out.println(e+" "));
        System.out.println();
//        s.filter(e -> e.startsWith("a")).map(e -> e.toUpperCase()).sorted().forEach(e -> System.out.println(e));



        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> n = numbers.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(n);

        // Difference between map() and filter()
        // map() is used to transform one object into other by applying a function.
        // filter() is used to select elements as per the Predicate passed as argument.
        // map() returns the Stream instance whereas filter() returns boolean value.


        // filter() take Predicate as argument. and Predicate returns boolean value whereas Function returns a value.
        // map() each element operates perform on each element of stream and returns a new stream.


        // sorted() is used to sort the stream elements.
        numbers.stream().sorted().forEach(e -> System.out.print(e+" "));

        // distinct() is used to remove duplicate elements from the stream.
        System.out.println();
        numbers.stream().distinct().forEach(e -> System.out.print(e+" "));


        // count() is used to count the number of elements in the stream.
        System.out.println();
        System.out.println(numbers.stream().count());


        // limit() is used to reduce the size of stream.
        System.out.println();
        numbers.stream().limit(2).forEach(e -> System.out.print(e+" "));

        // skip() is used to skip the elements from the stream.
        System.out.println();
        numbers.stream().skip(2).forEach(e -> System.out.print(e+" "));


        // min() is used to find the minimum value in the stream.
        System.out.println();
        System.out.println(numbers.stream().min((e1, e2) -> e1.compareTo(e2)));


        // max() is used to find the maximum value in the stream.
        System.out.println();
        System.out.println(numbers.stream().max((e1, e2) -> e1.compareTo(e2)));


        // allMatch() is used to check whether all the elements in the stream are matching the given condition.
        System.out.println();
        System.out.println(numbers.stream().allMatch(e -> e%2==0));
    }
}
