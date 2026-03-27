
public class Demo {
    int a ;
    Demo(int a){
        this.a = a;
    }    
    public static void main(String[] args) {
        Demo d1 = new Demo(10);
        System.out.println(d1.a);
    }
}
