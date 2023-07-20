package functionalProgramming;


class A {
    public void show() {
        System.out.println("in A show");
    }
}
public class Anonymous {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("in new A show");
            }
        };
        obj.show();
    }
}
