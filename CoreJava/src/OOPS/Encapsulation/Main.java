package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {

        // Encapsulation is a process of wrapping code and data together into a single unit.

        A obj = new A(10, 20);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
        obj.setA(100);
        obj.setB(200);
        System.out.println(obj.getA());
        System.out.println(obj.getB());


        //Encapsulation is a process of wrapping code and data together into a single unit.
        // We can create a fully encapsulated class in Java by making all the data members of the class private.
        // Now we can use setter and getter methods to set and get the data in it.
        // The Java Bean class is the example of a fully encapsulated class.
        // The main purpose of encapsulation is to hide the implementation details from users.
        // Encapsulation is the first pillar of OOPs.
        // Encapsulation is also known as data hiding.
        // Encapsulation can be achieved by using access modifiers such as private, protected, and public.
        // Encapsulation is used to make the code more flexible and maintainable by making the variables and methods private.
    }
}
