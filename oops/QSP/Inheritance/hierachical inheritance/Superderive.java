class Super{
    int a = 10;
}
class sub1 extends Super{
    int b = 20;
}
class sub2 extends Super{ 
    int c = 40;
}

public class Superderive {
    
    public static void main(String[] args) {
        Super s = new Super();
        System.out.println(s.a);
        // System.out.println(s.b); CTE
        // System.out.println(s.c); CTE

        sub1 s1 = new sub1();

        System.out.println(s1.a);
        System.out.println(s1.b);
        // System.out.println(s1.c); CTE

        sub2 s2 = new sub2();

        System.out.println(s2.a);
        // System.out.println(s2.b); CTE
        System.out.println(s2.c);


    }    
}
