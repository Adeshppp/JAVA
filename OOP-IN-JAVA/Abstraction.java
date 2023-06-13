abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Creating an animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Creating a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}



public class Abstraction{
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();

    }
}


//topics covered:
//1. construction chaining

