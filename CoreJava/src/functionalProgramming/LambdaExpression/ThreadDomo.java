package functionalProgramming.LambdaExpression;

public class ThreadDomo {
    public static void main(String[] args){

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread: "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread t = new Thread(r);
        t.setName("JOHN");
//        r.run();
        t.start();


        Runnable r2 = () -> {
            for (int i = 1; i <=10; i++) {
                System.out.println("child thread: "+i*2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2 = new Thread(r2);
        t2.setName("JANE");
        t2.start();
    }
}
