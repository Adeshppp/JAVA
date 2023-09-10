package ObjectOrientedProgramming.Constructors.CopyConstructors;

import ObjectOrientedProgramming.Constructors.Student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Sakshee", 25);
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
