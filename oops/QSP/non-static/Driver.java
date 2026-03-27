
class a{
    static int a =10;
    int b = 20;

    static{
        System.out.println(a);
    }
    {
        System.out.println(b);
    }
}

class b extends a{
    static int c =30;
    int d =40;
    static {
        System.err.println(c);

    }
    {
        System.out.println(d);
    }
}
public class Driver {
        public static void main(String[] args) {
            b b1 = new b();

        }
}
