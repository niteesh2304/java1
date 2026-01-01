class NonStatic{
   
   {
    System.out.println("from MLNSI-1");
   }
   int a = 10;//-->Single line nonstatic initailizer
   int b;

   {
    System.out.println("from MLNSI-2");
    System.out.println(a);
    System.out.println(b);
   } 
   public static void main(String []args){
    System.out.println("From main method");
    NonStatic ns = new NonStatic();//-->object creation
                // |          |
                // ------------
                //       |
                //       v
                //constructor creation 
    System.out.println(ns.a);//Call by object refernce
    System.out.println(ns.b);
    System.out.println("End of the main method");                                   
   }

   {                                   //-------|
    System.out.println("From MLNSI-3");//       |
    a=30;                              //       |
    b=20;                              //       |-->Multi Line 
    System.out.println(a);             //       |   NonStatic 
    System.out.println(b);             //       |   Initializer
   }                                   //-------|       

}