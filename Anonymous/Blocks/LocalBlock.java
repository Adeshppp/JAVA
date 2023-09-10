package Anonymous.Blocks;

public class LocalBlock {
    public static void main(String[] args) {
        {
            {
                {
                    {
                        System.out.print("Local block : ");
                        System.out.println("Local blocks are declared within a method or constructor. They are created when the method or constructor is called and destroyed when the method or constructor is exited.");
                    }
                }
            }
        }
    }

}
