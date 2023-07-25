package functionalProgramming.MethodandConstructorReferences.ConstructorRef;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        // Method Reference
        list.stream().forEach(System.out::println);



    }
}
