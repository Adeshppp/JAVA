package JAVA_8.MethodAndConstructorReference;

public class Test {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i=0; i<10; i++) {
                System.out.println("Child thread!!!");
            }
        };
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        t.start();
        t2.start();
        for (int i=0; i<10; i++) {
            System.out.println("Main thread!!!");
        }
    }
}
