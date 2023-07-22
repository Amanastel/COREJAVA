package functionalProgramming.LambdaExpression;


@FunctionalInterface
public interface MyInter {
    public abstract void sayHello();


    // we can have only one abstract method in a functional interface
    // we can't create a functional interface with two abstract methods
}


//create separate class and implement the interface
// anonymous class for implementing the interface
// lambda expression for implementing the interface