package Anonymous.Strings;

public class StringLiteral {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        str1 = "World";
        System.out.println(str1==str2);
    }
}
