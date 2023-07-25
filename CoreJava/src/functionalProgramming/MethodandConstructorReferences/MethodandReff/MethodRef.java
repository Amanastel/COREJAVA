package functionalProgramming.MethodandConstructorReferences.MethodandReff;

public class MethodRef {
    public static void main(String[] args) {

        // Method Reference
        // Method Reference is used to refer method of functional interface.
        // Method Reference is compact and easy form of lambda expression.
        // Method Reference is divided into 4 types:
        // 1. Reference to a static method
        // 2. Reference to an instance method
        // 3. Reference to a constructor
        // 4. Reference to a constructor using array

        // 1. Reference to a static method
        // Syntax: ContainingClass::staticMethodName

        // Compare this snippet from src/functionalProgramming/MethodandConstructorReferences/MethodRef.java:
        // package functionalProgramming.MethodandConstructorReferences;



        // provide the implementation of workInterface using lambda expression
        WorkInter workInterface = () -> System.out.println("This is the task of workInterface");
        workInterface.doTask();

        // provide the implementation of workInterface using anonymous class
        WorkInter workInterface2 = new WorkInter() {
            @Override
            public void doTask() {
                System.out.println("Do work using anonymous class");
            }
        };

        workInterface2.doTask();


        // provide the implementation of workInterface using method ref
        WorkInter workInterface4 = Stuff::doStuff;
        workInterface4.doTask();


        WorkInter dot = Stuff::threadTask;
//        dot.doTask();

        Runnable runnable = Stuff::threadTask;
        Thread thread = new Thread(runnable);
        thread.start();


        // non static method ref
        Stuff oj = new Stuff();
        Runnable runnable1 = oj::printNumber;
        Thread thread1 = new Thread(runnable1);
        runnable1.run();
    }
}
