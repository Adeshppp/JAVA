package ObjectOrientedProgramming.ObjectsClasses;

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type= "gel";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.write();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen2.printColor();
    }
}
