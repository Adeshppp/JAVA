package Anonymous.Static.inside_same_class;

public class StaticMethod {
    static int i = 10;
    static void display(){
        System.out.println("STATIC METHOD");
    }
    static{
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println(i);
        display();
    }
}
