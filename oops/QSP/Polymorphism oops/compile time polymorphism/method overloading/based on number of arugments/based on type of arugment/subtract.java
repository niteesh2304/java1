

public class subtract {
    public void sub(int a,int b){
        System.out.println(a-b);
    }
    public void sub(double a,int b){
        System.out.println(a-b);
    }
    public void sub(int a,double b){
        System.out.println(a-b);
    }
    public void sub(double a,double b){
        System.out.println(a-b);

    }
    public static void main(String[] args) {
        subtract s = new subtract();
        s.sub(1,2);
        s.sub(1.1, 2.1);
        s.sub(1, 1.101);
        s.sub(1.5, 3);
    }    
}
