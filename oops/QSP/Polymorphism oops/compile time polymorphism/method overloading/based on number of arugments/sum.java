
public class sum {
    
    public void add(){
        System.out.println(10+5);
    } 
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        sum s1 = new sum();
        s1.add();
        s1.add(1, 14);
        s1.add(10, 20, 30);
    }    
}
