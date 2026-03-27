public class Mobile {
    Mobile(){
        super();
        System.out.println("simple Mobile");
    }    
    Mobile(String ram){
        this();
        System.out.println("Moblie "+ram);
    }
    Mobile(String ram,String memory){
        this(ram);
        System.out.println("Mobile with "+memory);
    }
    Mobile(String ram,String memory,String battery){
        this(ram, memory);
        System.out.println("Mobile with "+battery);
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        System.out.println("-------------------------------");
        Mobile m2 = new Mobile("DDR4 16gb");
        System.out.println("-------------------------------");
        Mobile m3 = new Mobile("8gb ram", "256gb ");
        System.out.println("-------------------------------");
        Mobile m4 = new Mobile("10gb ram", "512gb", "5000mah");
        System.out.println("-------------The end---------------");
    }
}
