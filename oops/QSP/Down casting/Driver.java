class a{
    int  a =10;
}
class b extends a{
    int b=20;
}
class c extends b{
    int c=30;
}
class d extends c {
    int d= 40;
}
public class Driver {
    public static void main(String[] args) {
        a a1= new c();

        System.out.println(a1.a);

        b b1 = (b)a1;

        System.out.println(b1.a);
        System.out.println(b1.b);

        c c1 = (c)b1;

        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);

        d d1 = (d)c1;

        // System.out.println(d1.a);  ]
        // System.out.println(d1.b);  ]
        //                            ]  -------->   ClassCastException
        // System.out.println(d1.c);  ]  
        // System.out.println(d1.d);  ]


    }
}
