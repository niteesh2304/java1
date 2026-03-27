class NonStatic_2{
    int a;
    int b;
    {
        a = 10;
        b = 10;
        System.out.println(a);
    }
    public static void main(String [] args){
        System.out.println("Welcome to the world of friends");
        NonStatic_2 ns = new NonStatic_2();
        System.out.println(ns.a);
        System.out.println(ns.b);
    }
    {
        a = 20;
        b = 40;
    }
}