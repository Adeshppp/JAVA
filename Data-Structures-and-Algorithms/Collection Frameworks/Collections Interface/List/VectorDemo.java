import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("a");//collection interface method
        v.add(1, "d");//list interface method
        v.addElement("e");// vector interface method
        v.addElement("s");
        v.addElement("h");
        v.addElement(null);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
//        v.addElement(4);
        System.out.println(v);
        System.out.println(v.get(0));
        System.out.println(v.elementAt(1));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.size());
        System.out.println(v.capacity());


        System.out.println(v);
        v.remove(6);
        v.removeAllElements();
        System.out.println(v);
    }
}
