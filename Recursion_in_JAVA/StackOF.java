public class StackOF {
    private static int i = 0;

    public static void main(String[] args) {
        System.out.println(A());
    }

    public static String A() {
        System.out.println(i++);
        return A();
    }
}

///this code will throw run time error because of stack overflow
