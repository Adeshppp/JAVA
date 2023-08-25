package JAVA_8.functionalInterfaces;


@FunctionalInterface
public interface Interf {

    // Abstract method
    public void m1();

    // Default method
    default void m2(){

    }

    // Static method
    public static void m3(){

    }
}
