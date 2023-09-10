package JAVA_8.MethodAndConstructorReference.ByUsingConstructorReference.eg2;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
//        Interf i = (name, rollNo, marks, age) -> new Student(name,rollNo,marks,age);
        Interf i = Student::new;
        Student s1 = i.get("Adesh","1",100,24);
        Consumer<Student> s = student -> System.out.println(student.name+" "+student.rollNo+" "+student.marks+" "+student.age);
        s.accept(s1);
    }
}
