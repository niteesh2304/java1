import java.util.Scanner;

public class PrimeFactor{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int n = sc.nextInt();
        for(int i = 2 ; i<=n ; i++){
            if(prime(i)){
                int x =i;
                while(n%x==0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }
    public static boolean prime(int n){
        if(n==2||n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i = 5 ; i*i <= n ; i+=6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}