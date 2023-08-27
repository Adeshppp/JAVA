package JAVA_8.DefaultMethod;

public interface Interf {
//    public void m1();
//    public void m2();
    default void m3(){
        System.out.println("Default method!!");
    }
}
