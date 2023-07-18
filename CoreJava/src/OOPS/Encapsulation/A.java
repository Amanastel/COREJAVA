package OOPS.Encapsulation;

public class A {
    private int a;
    private int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() { // getter
        return a;
    }

    public void setA(int a) { // setter
        this.a = a;
    }

    public int getB() { // getter
        return b;
    }

    public void setB(int b) { // setter
        this.b = b;
    }
}
