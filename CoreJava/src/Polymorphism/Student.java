package Polymorphism;

public class Student {
    public void study() {
        System.out.println("Student is studying");
    }

    public void study(int hours) {
        System.out.println("Student is studying for " + hours + " hours");
    }

    public void study(String book) {
        System.out.println("Student is studying " + book);
    }
}
