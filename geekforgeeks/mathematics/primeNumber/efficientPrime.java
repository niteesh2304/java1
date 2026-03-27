import java.util.Scanner;


public class efficientPrime{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args []){
        int n = sc.nextInt();
        if(prime(n))
            System.out.println("it's prime");
        else 
            System.out.println("it's not prime");
    }
    public static boolean prime(int n){
        if(n==1)
            return false;
        for(int i = 2 ; i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}