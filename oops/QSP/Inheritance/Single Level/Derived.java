
class Base{

    Base(){
        // Super();
        System.out.println("PCC");
    }
    String pM = "Iam parent";
}
public class Derived extends Base{
    Derived(){
        // Super();
        System.out.println("c.c.c");

    }
    String cM = "Iam child";
    public static void main(String[] args) {
        Derived d1 = new Derived();
        System.out.println(d1.cM);
        System.out.println(d1.pM);
    }
}
