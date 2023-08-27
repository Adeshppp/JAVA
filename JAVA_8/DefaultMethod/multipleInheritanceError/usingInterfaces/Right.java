package JAVA_8.DefaultMethod.multipleInheritanceError.usingInterfaces;

public interface Right {
    default void m1(){
        System.out.println("Right interface m1 method");
    }
    default void m2(){
        System.out.println("Right interface m2 method");
    }
}
