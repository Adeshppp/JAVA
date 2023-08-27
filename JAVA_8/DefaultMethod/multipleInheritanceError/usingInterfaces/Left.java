package JAVA_8.DefaultMethod.multipleInheritanceError.usingInterfaces;

public interface Left {
    default void m1(){
        System.out.println("Left interface m1 method");
    }
}
