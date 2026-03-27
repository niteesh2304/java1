class General{

    String s1= "general";

    static String s2 = "s-general";

    {
        System.out.println("MLNSI-General");
        System.out.println(s1);
        System.out.println(s2);
    }
    static{
        System.out.println("MLSI-General");
        System.out.println(s2);
    }
}


class Special1 extends General{
    String s3 = "Special";

    static String s4 ="S-Special";

    {
        System.out.println("MLNSI-special1");
        System.out.println(s3);
        System.out.println(s4);
    }
    static{
        System.out.println("MLSI-Special");
        System.out.println(s4);
    }
}

class Special2 extends Special1{
    String s5 ="Special2";
    static String s6 ="S-Special2";

    {
        System.out.println("MLNSI-Special2");
        System.out.println(s5);
        System.out.println(s6);
    }
    static{
        System.out.println("MLSI-Special2");
        System.out.println(s6);
    }
}
public class GeneralDriver {
    public static void main(String[] args) {
        General g1 = new General();
        System.out.println("--------------------------------------");
        Special1 s1 = new Special1();
        System.out.println("---------------------------------------");
        Special2 s2 = new Special2();
    }
}
