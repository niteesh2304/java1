class parent{
    int a;
    parent(int a){
        System.out.println("parent class constructor");
        this.a=a;
    }
    public int geta(){
        return a;
    }
}

public class child extends parent {
    int b;
    int c;
    child(int a,int b){
        super(a);
        System.out.println("child class 2 arugment constructor: ");
        this.b=b;
    }
    child(int a,int b,int c){
        this(a,b);
        System.out.println("child class 3 arugment constructor: ");
        this.c = c;
    }
    public String getMembers(int a ,int b,int c){
        return  "7"+a+"\n"+b+"\n"+c;
    }
    public String getMembers(){
        return ""+super.a+"\n"+this.b+"\n"+this.c+"";
    }
    public static void main(String[] args) {
        child ch1 = new child(10, 20, 30);
        String members =ch1.getMembers();
        System.out.println(members);
        child ch2 =new child(40, 50);
        String members2 = ch2.getMembers();
        System.out.println(members2);
    }
    
}