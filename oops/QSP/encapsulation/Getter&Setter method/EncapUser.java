class Encap2{
    private int a = 10;

    public int getter(){
        return a;
    }
    public void setter (int a1){
        a = a1;
    }
}

public class EncapUser {
    public static void main(String[] args) {

        Encap2 e1 = new Encap2();
        int a = e1.getter();
        System.out.println(a);;

        e1.setter(20);
        System.out.println(e1.getter());
    }    
}
