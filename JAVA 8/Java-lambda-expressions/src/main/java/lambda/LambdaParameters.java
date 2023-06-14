package lambda;



interface Addable{
    int addition(int a, int b);
}

//class AddabelImpl implements Addable{
//
//    @Override
//    public int addition(int a, int b) {
//        return a+b;
//    }
//}

public class LambdaParameters {
    public static void main(String[] args) {

        Addable addition = (a,b) -> a+b;
        System.out.println(addition.addition(2,3));

    }
}
