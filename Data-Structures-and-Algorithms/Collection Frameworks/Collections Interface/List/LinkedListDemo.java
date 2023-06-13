import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("A");
        l.add("D");
        l.add("E");
        l.add("S");
        l.add("H");
        l.add(null);
        l.add(9);
        l.add(4);
        l.add(8);
        l.remove(5);
        l.add(5, "P");
        l.addFirst("\"");
        l.addLast("\"");
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
