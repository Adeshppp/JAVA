public class RecursionWithStrings {
    public static void main(String[] args) {
        String str = "the simple engineer";
        System.out.print(reverseString(str));
    }

    public static String reverseString(String str) {
        if (str.equals("")) return "";//base condition
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
