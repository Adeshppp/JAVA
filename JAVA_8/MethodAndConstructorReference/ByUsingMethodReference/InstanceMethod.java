package JAVA_8.MethodAndConstructorReference.ByUsingMethodReference;

public class InstanceMethod {

    public void m1(){
        for(int i=0;i<10;i++) System.out.println("Child method!!!");
    }
    public static void main(String[] args) {
        InstanceMethod instanceMethod = new InstanceMethod();
        Runnable r = instanceMethod::m1;
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++) System.out.println("Main thread!!!");
    }
}
