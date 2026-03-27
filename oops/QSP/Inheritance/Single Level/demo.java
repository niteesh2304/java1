class parent{
    int a = 10;
}

public class demo extends parent{
    int b = 20;
    public static void main(String[] args) {
        
        
        demo d1 = new demo();

        System.out.println(d1.a);
        System.out.println(d1.b);

        parent d2 = new parent();

        System.out.println(d2.a);
        // System.out.println(d2.b);   CTE
    }
}
