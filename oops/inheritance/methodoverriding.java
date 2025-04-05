
class car{
    public car(){
        System.out.println("constructer");
    }
    public car(int a){
        System.out.println("niteesh "+ a);
    }
    public void engine(){
        System.out.println("normal engine");
    }
}

class bmw extends car{
    public void engine(){
        System.out.println("v12");
    }
}
class benz extends car{
    public void engine(){
        System.out.println("v6");
    }
}

public class methodoverriding{
    public static void main(String args[]){
        // bmw d1 = new bmw();
        // benz d2 = new benz();
        // d1.engine();
        // d2.engine();
        
        car c1 = new car();
        car c2 = new car(1); 
    
    }
}