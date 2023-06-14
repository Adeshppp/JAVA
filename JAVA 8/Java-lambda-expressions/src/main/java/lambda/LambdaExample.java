package lambda;


// Functional interface
interface Shape{
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class draw method.");
    }
}




public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("rectangle class draw method.");
        rectangle.draw();
    }
}
