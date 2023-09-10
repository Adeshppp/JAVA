package Anonymous.Blocks;

public class InstanceBlock {
    private int i;
    {
        i=10;
        System.out.print("Instance block : ");
        System.out.println("Instance blocks are declared within a class but outside of any method or constructor. They are created when an object of the class is created and destroyed when the object is garbage collected.");
    }
    public static void main(String[] args) {
        InstanceBlock  instanceBlock = new InstanceBlock();
        System.out.println(instanceBlock.i);
    }
}
