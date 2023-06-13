package bank;

//default : same package can access the data
//public : from everywhere
//protected: same and sub classes and same package can access data
//private : only same class can access the data
class Account{
    public String name;
    protected String email;
    private String password;

    public void setPassword(String pass){
        this.password=pass;
    }
    public String getPassword(){
        return this.pass;
    }
}

public class Bank{
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="Adesh";
        acc1.email="adeshpadwal21@gmail.com";
        acc1.setPassword("abcd");
        acc1.getPassword();
    }
}