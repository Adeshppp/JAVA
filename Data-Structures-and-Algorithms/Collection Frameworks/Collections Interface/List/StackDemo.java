import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("a");
        s.push("d");
        s.push("e");
        s.push("s");
        s.push("h");
        s.push(null);
        s.push(948);
        s.push(121);

        System.out.println(s.search("a"));//return offset
        System.out.println(s.search("z"));//return offset //-1
        System.out.println(s);
        s.pop();

        System.out.println(s.peek());
        System.out.println(s);
        System.out.println("is stack empty???? : " + s.empty());
        System.out.println(s);
    }
}
