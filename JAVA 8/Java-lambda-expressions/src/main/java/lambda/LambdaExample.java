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

        System.out.println("================================ By using Lambda Expressions ================================");

        Shape rectangle = () -> System.out.println("Rectangle class draw method.");
        rectangle.draw();

        Shape square = () -> System.out.println("Square class draw method.");
        square.draw();

        Shape circle = () -> System.out.println("Circle class draw method.");
        circle.draw();

        System.out.println("================================ By passing Lambda Expressions as a parameter ================================");

        print(rectangle);
        print(square);
        print(circle);

        System.out.println("================================ By calling Lambda Expressions as a parameter ================================");

        print(() -> System.out.println("Rectangle class draw method."));
        print(() -> System.out.println("Square class draw method."));
        print(() -> System.out.println("Circle class draw method."));

    }

    private static void print(Shape shape){
        shape.draw();
    }
}
