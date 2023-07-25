package functionalProgramming.MethodandConstructorReferences.MethodandReff;

public class Stuff {
    public static void doStuff() {
        System.out.println("in doStuff");
    }


    public static void threadTask(){
        for(int i=1; i<=10; i++){
            System.out.println(i*2);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printNumber(){
        System.out.println(100);
    }

}
