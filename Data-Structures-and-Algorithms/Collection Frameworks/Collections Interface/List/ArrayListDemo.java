//import java.util.ArrayList;
//
//class ArrayListDemo {
//    public static void main(String[] args) {
//        ArrayList<String> l = new ArrayList<>();
//        l.add("A");
//        l.add("D");
//        l.add("E");
//        l.add("S");
//        l.add("H");
//        l.add(" ");
//        l.add("null");
//        l.add("100");
//        l.remove(7);
//        l.remove(6);
//        l.remove(5);
//        System.out.println(l);
//    }
//}


//===================================================  Generics  ===================================================

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add("D");
        l.add("E");
        l.add("S");
        l.add("H");
        l.add("A");
        l.add(" ");
        l.add("A");
        l.add(null);
        l.add(100);

        System.out.println(l.indexOf("A"));
        System.out.println(l.lastIndexOf("A"));
        l.remove(5);
        l.set(6, " ");
        System.out.println(l);
    }
}
