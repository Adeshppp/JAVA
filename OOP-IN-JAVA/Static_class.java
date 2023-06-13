class Student{
    String name;
    static String school;
}

public class Static_class{
    public static void main(String[] args) {
        Student.school="NJIT";
        Student s1=new Student();
        s1.name="Adesh";
        System.out.println(s1.school);
    }
}