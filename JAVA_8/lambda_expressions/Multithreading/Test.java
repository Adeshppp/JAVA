package JAVA_8.lambda_expressions.Multithreading;

public class Test {
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
        Runnable r = ()-> {
            for (int i = 0; i < 10; i++) System.out.println("Child thread!!!");
        };
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++) System.out.println("Main Thread");
    }
}

