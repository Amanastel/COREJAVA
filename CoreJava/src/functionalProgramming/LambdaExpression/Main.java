package functionalProgramming.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lambda Expression is a way to implement Functional Interface
        // Functional Interface is an interface with only one abstract method
        // Lambda Expression is a way to implement Functional Interface without creating a class


       MyInter myInter = new MyInterImpl();
       myInter.sayHello();


       MyInter i = new MyInter() {
              @Override
              public void sayHello() {
                System.out.println("this is anonymous class");
              }
         };

       i.sayHello();


       //using functional interface with the help of lambda expression
        MyInter i2 = () -> System.out.println("this is lambda expression");
        i2.sayHello();



        //using functional interface with the help of anonymous class
       SumInter sumInterface = new SumInter() {
           @Override
           public int sum(int a, int b) {
               return a+b;
           }
       };
       System.out.println(sumInterface.sum(10, 20));

         //using functional interface with the help of lambda expression

        SumInter sumInterface2 = (a, b) -> a+b;
        System.out.println(sumInterface2.sum(10, 10));

        SumInter sumInterface3 = (a, b) -> {
            return a+b;
        };
        System.out.println(sumInterface3.sum(20, 20));



        //using functional interface with the help of anonymous class
        LengthInter lengthInter = new LengthInter() {
            @Override
            public int getLength(String s) {
                return s.length();
            }
        };
        System.out.println(lengthInter.getLength("hello"));


        //using functional interface with the help of lambda expression
        LengthInter lengthInter2 = (s) -> s.length();
        System.out.println(lengthInter2.getLength("hello2"));
    }
}
