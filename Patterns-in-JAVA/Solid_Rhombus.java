class Solid_Rhombus{
    public static void main(String[] args) {
        PrintPattern pattern=new PrintPattern();
    }
}
class PrintPattern{
    PrintPattern(){
        int n=5;
        for (int i = 1;i<=n;i++) {
//            System.out.println(" ");
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}