import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Adesh", 100);
        m.put("Nilesh", 200);
        m.put("Piyush", 300);
        m.put("Pushpa", 400);
        m.put("Samantha", 500);
        System.out.println(m);

        System.out.println(m.put("Adesh", 1000));

        Set s = m.keySet();
        System.out.println(s);

        Collection c = m.values();
        System.out.println(c);

        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + " : " + m1.getValue());
            if (m1.getKey().equals("Adesh")) m1.setValue(10000);
        }
        
        System.out.println(s1);
    }
}
