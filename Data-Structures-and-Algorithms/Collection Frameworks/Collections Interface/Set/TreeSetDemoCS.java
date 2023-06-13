package Set;

import java.util.Comparator;
import java.util.TreeSet;

//customized sorting uses comparator interface which has compare() and equals()
public class TreeSetDemoCS {
    public static void main(String[] args) {
        TreeSet s = new TreeSet(new myComparator());
        s.add(10);
        s.add(20);
        s.add(0);
        s.add(30);
        s.add(60);
        s.add(40);
        s.add(40);
        System.out.println(s);
    }

}

class myComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        
//        if (I1 < I2) return 1;
//        else if (I1 > I2) return -1;
//        else return 0;

//        return I2.compareTo(I1);
        return -I1.compareTo(I2);
    }
}
