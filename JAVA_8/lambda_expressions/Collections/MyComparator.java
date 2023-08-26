package JAVA_8.lambda_expressions.Collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer I1, Integer I2) {
        return (I1<I2)?-1:(I1>I2)?1:0; // TERNARY OPERATOR
//        if(I1<I2) return -1;
//        else if (I2<I1) return 1;
//        else return 0;
    }
}

