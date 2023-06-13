class Diamond{
    public static void main(String[] args) {
        PrintPattern pattern=new PrintPattern();
    }
}

class PrintPattern{
    PrintPattern(){
        int n=4;
        int z=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= z; j++) {
                System.out.print("*");
            }
            z=z+2;
            System.out.println();
        }
        z=z-2;
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= z; j++) {
                System.out.print("*");
            }
            z=z-2;
            System.out.println();
        }
    }
}