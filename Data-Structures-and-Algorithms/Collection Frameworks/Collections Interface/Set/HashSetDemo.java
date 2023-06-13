package Set;

import java.util.LinkedHashSet;

//ahshset: no duplicates
public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet h = new HashSet();// no insertion oreder preserved

        LinkedHashSet h = new LinkedHashSet();// insertion order preserved

        h.add("A");
        h.add("D");
        h.add("E");
        h.add("S");
        h.add("H");
        h.add(null);
        System.out.println(h.add("A"));
        System.out.println(h);
    }
}

