package Set;

import java.util.TreeSet;

public class TreeSetDemoDNS {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
//        TreeSet s = new TreeSet(Comparator c);
//        TreeSet s = new TreeSet(Any collection object);
        s.add("A");
        s.add("D");
        s.add("E");
        s.add("S");
        s.add("H");
//        s.add(1); //no heterogeneous objects
        s.add("P");
        s.add("A");
        s.add("D");
        s.add("W");
        s.add("A");
        s.add("L");
        s.add(".");
//        s.add(new StringBuffer("a"));//class cast exception //string buffers are not comparable
//        s.add(null);
        System.out.println(s);
        System.out.println("a".compareTo("z"));
        System.out.println("z".compareTo("a"));
        System.out.println("z".compareTo("z"));
//        System.out.println("z".compareTo(null));//java.lang.NullPointerException:

    }
}
