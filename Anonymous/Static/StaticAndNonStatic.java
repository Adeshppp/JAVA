package Anonymous.Static;

public class StaticAndNonStatic {
    int i=10;
    static int j = 20;
    public void displayNonStatic(){
        System.out.println("Non static method");
    }
    public static void displayStatic(){
        System.out.println("Static method");
    }
    static{
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        StaticAndNonStatic staticAndNonStatic = new StaticAndNonStatic();
        System.out.println(staticAndNonStatic.i);
        staticAndNonStatic.displayNonStatic();
        System.out.println(j);
        displayStatic();
    }
}
