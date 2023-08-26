package JAVA_8.Multithreading;

public class Test {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++) System.out.println("Main Thread");
    }
}
