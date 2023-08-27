package JAVA_8.functionalInterfaces;


@FunctionalInterface
public interface Interf {

    // Abstract method
    void m1();

    // Default method
    default void m2(){

    }

    // Static method
    static void m3(){

    }
}
