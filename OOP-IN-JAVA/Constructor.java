class Constructor{
    public static void main(String[] args) {

        OOPS s1=new OOPS();
        s1.name="Adesh";
        s1.age=23;
        OOPS s2=new OOPS(s1);
    }
}

class OOPS{
    String name;
    int age;
    OOPS(OOPS s1){
        this.name=s1.name;
        this.age=s1.age;
        System.out.println(this.name + " "+ this.age);
    }
    OOPS(){

    }

}