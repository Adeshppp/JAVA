package JAVA_8.MethodAndConstructorReference.ByUsingConstructorReference.eg1;

public class Test {
    public static void main(String[] args) {
//        Interf i = Sample::new;
//        Sample s1 = i.get();
//        Sample s2 = i.get();
//        Sample s3 = i.get();
//        Sample s4 = i.get();
//        i.get();

        Interf i1 = Sample::new;
        Sample s5 = i1.get("Adesh");
    }
}
