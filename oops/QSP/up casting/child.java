class  parent{
    int a = 10;
}

public class child extends parent {
    int b = 20;
    int c =30;
    int g=40;
    public static void main(String[] args) {
        child ch = new child();
        System.out.println(ch.a);
        System.out.println(ch.b);

        System.out.println("-------");
        // System.out.println(ch);
        parent p1 = ch; // upcasting 

        System.out.println(p1.a);
        // System.out.println(p1.g); CTE
        // System.out.println(p1.c); CTE
        // System.out.println(p1.b); CTE
    }    
}
