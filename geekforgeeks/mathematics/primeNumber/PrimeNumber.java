import java.util.Scanner;

public class PrimeNumber{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int n = sc.nextInt();

        if(primeCount(n)>=1)
            System.out.println("It's not a prime number");
        else
            System.out.println("It's a prime number");
    }
    public static int primeCount(int n){
        int count = 0;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}