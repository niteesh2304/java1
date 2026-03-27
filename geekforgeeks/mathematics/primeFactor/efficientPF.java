import java.util.Scanner;

public class efficientPF{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int n = sc.nextInt();
        printPrimeFactor(n);

    }
    public static void printPrimeFactor(int n){
        if(n<=1){
            System.out.println("Invalid");
            return;
        }
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }

}