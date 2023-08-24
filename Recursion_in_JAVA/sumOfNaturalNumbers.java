public class sumOfNaturalNumbers {
    public static void main(String[] args) {
//        System.out.println(recursiveSummation(500000000));
        System.out.println(recursiveSummation(500));
        System.out.println(recursiveSummation(5));
        System.out.println(recursiveSummation(10));


    }

    public static long recursiveSummation(long number) {
        if (number <= 1) return number;
        return recursiveSummation(number - 1) + number;
    }
}
