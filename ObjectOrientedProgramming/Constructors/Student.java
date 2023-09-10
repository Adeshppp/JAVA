package ObjectOrientedProgramming.Constructors;

public class Student {
    public String name;
    public int age;
    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }

//    Non parameterized constructors
    public Student(){
        System.out.println("Non parameterized constructor called...");
    }

//    Parameterized constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//    Copy constructor
    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
    }

}
