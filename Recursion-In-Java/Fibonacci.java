public class Fibonacci {
    public static void main(String[] args) {
        int number = 9;
        System.out.println(fib(number - 1));
    }

    public static long fib(long number) {
        if (number == 0 || number == 1) return number;
        return fib(number - 1) + fib(number - 2);
    }
}
