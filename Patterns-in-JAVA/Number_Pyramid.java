class Number_Pyramid{
    public static void main(String[] args) {
        PrintPattern pattern=new PrintPattern();
    }
}

class PrintPattern{
    PrintPattern(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n/2)+(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}