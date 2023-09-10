package ObjectOrientedProgramming.Polymorphism.CompileTimePolymorphism;

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Adesh";
        s1.age = 24;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
