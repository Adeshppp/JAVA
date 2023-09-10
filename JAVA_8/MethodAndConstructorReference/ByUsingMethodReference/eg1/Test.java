package JAVA_8.MethodAndConstructorReference.ByUsingMethodReference.eg1;

public class Test {
    public static void sum(int x, int y){
        System.out.println("The sum is "+(x+y));
    }

    public static void main(String[] args) {
//        Interf i = (a,b) -> System.out.println("The sum is "+(a+b));
//        i.add(2,3);
        Interf i1 = Test::sum;
        i1.add(100,200);
    }
}
