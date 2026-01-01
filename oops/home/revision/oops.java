class Car{
    int x = 10; //attribute
    public static void start(){
        System.out.println("The car has been started ...");
    }
    public static void drive(){
        System.out.println("The car can be driven !");

    }
    public static void park(){
        System.out.println("The car can be parked !");
    }
}
class Authentication{
    public static void login(){

    }
    public static void loginout(){

    }
    public static void signup(){
        
    }
}

public class oops{
    public static void main(String args[]){
        Car Lambo = new Car();
        Lambo.start();
        Lambo.drive();
        Lambo.park();
        System.out.println(Lambo.x);
    }
}
