package Anonymous.Blocks;

public class StaticBlock {
    public static void main(String[] args) {

    }
    static{
        System.out.print("Static block : ");
        System.out.println("Static blocks are executed when the class is loaded into memory and are destroyed when the class is unloaded from memory.");
    }
}
