class parent{
    int a = 10;
}
class child extends parent{
    int b = 30;
}
public class child2 extends child{ 
    int c = 14;
    public static void main(String[] args) {
        parent p1 = new parent();
        System.out.println(p1.a);
        // System.out.println(p1.b); CTE
        // System.out.println(p1.c); CTE
        child c1 = new child();

        System.out.println(c1.a);
        System.out.println(c1.b);
        // System.out.println(c1.c); CTE
        
        child2 c2 = new child2();
        System.out.println(c2.a);
        System.out.println(c2.b);
        System.out.println(c2.c);

    }
}
