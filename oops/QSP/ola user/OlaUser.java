class ola{
    {
        System.out.println("welcome to ola");
    }
    String source;
    String destination;
    ola(String source,String destination){
        source = source;
        destination = destination;

        System.out.println("Source point ="+source);
        System.out.println("destination point="+destination);
    }
}
class bike extends ola {
    {
        System.out.println("you have chosen ola bike");
    }
    private int fare = 50;

    bike(String source,String destination){
        super(source,destination);
    }
    public int getfare(){
        return fare;
    }
}
class car extends ola {
    {
        System.out.println("you have chosen go car...");
    }
    private int fare =100;
    car(String source,String destination){
        super(source,destination);

    }
    public int getfare(){
        return fare;
    }
}
class auto extends ola{
    {
        System.out.println("you have chosen ola auto.. ");
    }
    private int fare =70;
    auto(String source,String destination){
        super(source, destination);
    }
    public int getfare(){
        return fare;
    }

}


public class OlaUser {
    public static void main(String[] args) {
        ola o1=null;//Generalized container of parent        
        o1 =new bike("arumbakkam","vadpalani");
        o1=new car("arumbakkam","vadpalani");
        o1=new auto("arumbakkam","vadpalani");
    }    
}
