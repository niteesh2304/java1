
public class ConstructorOverloading {
    long phonenumber;
    String password;

    ConstructorOverloading(long phonenumber ,String password){
        this.phonenumber = phonenumber;
        this.password= password;
    }    
    ConstructorOverloading(String password,long phonenumber){
        this.phonenumber = phonenumber;
        this.password = password;
    }
    void display(){
        System.out.println("phone number: "+ phonenumber + " password: "+password);
    }
    public static void main(String[] args) {
        ConstructorOverloading u1 = new ConstructorOverloading(1231324, "walter");
        ConstructorOverloading u2 = new ConstructorOverloading("Saul good man", 01234);
        System.out.println(u1.phonenumber);
        u1.display();
        u2.display();
    }
    
}
