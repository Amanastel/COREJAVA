package functionalProgramming.functionalInterface.Consumer;

import java.util.function.Consumer;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {

        // Consumer
        // Consumer is a functional interface.
        // Consumer is used to perform some operations on an object.
        // Consumer have a method accept() which takes an argument and returns nothing.
        // Consumer modify the data and return nothing.
        // Consumer is used to perform some operations on an object.

        Person p = new Person("abc", 20);
        Consumer<Person> c1 = person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        };
        c1.accept(p);

        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello ji");
    }


}
