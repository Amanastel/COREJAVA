package functionalProgramming.MethodandConstructorReferences.ConstructorRef;

public class ConsRef {
    public static void main(String[] args) {



        // Constructor Reference is used to refer a constructor of a class.
        // Constructor Reference is used to create an object of a class.
        // Constructor Reference is used to create an object of a class using new keyword.
        // Constructor Reference is used to create an object of a class using new keyword and constructor name.
        // Constructor Reference is used to create an object of a class using new keyword and constructor name with arguments.

        // Constructor Reference
        Provider provider = Student::new;

       Student student = provider.getStudent();
       student.display();



    }
}
