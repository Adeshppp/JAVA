class Pen{
    String type;
    String color;
    public void write(){
        System.out.println(this.type+" "+this.color+" pen");
    }

}
class ClassObj{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="Gel";
//        pen1.write();
        Pen pen2= new Pen();
        pen2.color="Red";
        pen1.write();
        pen2.write();
    }
}