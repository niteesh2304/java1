class Super{
    int a =10;
}
public class sub extends Super{
    int b = 20;
    public static void main(String[] args) {
        Super s1 = new sub(); // upcasting

        System.out.println(s1.a);
        // System.out.println(s1.b); CTE

        System.out.println("----------------");

        sub s2 = (sub)s1;
    
        System.out.println(s2.a);
        System.out.println(s2.b);
        
        
    }
}
