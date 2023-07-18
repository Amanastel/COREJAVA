package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //polymorphism have 2 type

        // Compile time polymorphism

        Student student = new Student();
        student.study();
        student.study(5);
        student.study("Java");

        //here we can see that the study method is called from the student class
        //this is called compile time polymorphism
        //this is because the method is overloaded in the student class
        //if the method is not overloaded in the student class then the method from the parent class is called
        //if the method is overloaded in the student class then the method from the student class is called
        //this is called method overloading


        // Runtime polymorphism

        Person person = new Person();
        person.greet();

        Child child = new Child();
        child.greet();

        Person person2 = new Child();
        person2.greet();

        //here we can see that the greet method is called from the child class
        //even though the object is of type Person
        //this is because the object is of type Person but the reference is of type Child
        //this is called runtime polymorphism
        //if the method is not overridden in the child class then the method from the parent class is called
        //if the method is overridden in the child class then the method from the child class is called
        //this is called method overriding

    }
}
