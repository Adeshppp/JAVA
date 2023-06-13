
class Shape{

        String color;
        int l;
        int h;
    Shape(){

        System.out.print("Area of ");
    }

    public void area(int l,int h){
        this.l=l;
        this.h=h;
    }

    public void area(int r){
        this.l=r;
    }

}

class Triangle extends Shape{
     public void printarea(){
//         System.out.println(l);

         System.out.println("Triangle is "+(l*h)/2);
     }
}

class ETriangle extends Triangle{
    public void printarea(){

        System.out.println("Equi-Lateral Traingle is "+(l*l)/2);
    }
}

class Circle extends Shape{
    public void printarea(){
        System.out.println("Circle is "+ (3.14*l*l));
    }
}


class Inheritance{
    public static void main(String[] args) {
//        Triangle t1=new Triangle();
//        ETriangle e1=new ETriangle();
        Circle c1=new Circle();

//        e1.printarea();
        c1.area(2);
        c1.printarea();

    }
}