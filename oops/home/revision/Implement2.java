

class car {
    // constructor
    public car(){
        System.out.println("The car has been started..");
    }
    //parameterized constructor
    public car(String CarName){
        System.out.printf("%s car has been started..", CarName);
    }
    public static void Start(){
        System.out.println("The car is Started");
    }
}

public class Implement2{
    public static void main(String[] args){
        //car Ferrari = new car();
        car Ferrari = new car("Ferrai");
    }
}