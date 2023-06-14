package lambda;


// Functional interface
interface Shape{
    void draw();
}


public class LambdaExample {
    public static void main(String[] args) {

//        @Override
//        public void draw() {
//            System.out.println("Circle class : draw() method");
//        }

        Shape rectangle = () -> System.out.println("Rectangle class draw method.");
//        rectangle.draw();

        Shape square = () -> System.out.println("Square class draw method.");
        square.draw();

        Shape circle = () -> System.out.println("Circle class draw method.");
        circle.draw();

        print(rectangle);

    }

    private static void print(Shape shape){
        shape.draw();
    }
}
