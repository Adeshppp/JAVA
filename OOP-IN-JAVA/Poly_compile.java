class Poly_compile{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.printinfo(23, "Adesh");
    }
}
class Student{
    int age;
    String name;
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(int age, String name){
        System.out.println(name+" "+age);
    }
}