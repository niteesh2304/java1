import java.util.Scanner;

public class moreEfficientWay{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int n = sc.nextInt();
        printPrimeFactor(n);

    }
    public static void printPrimeFactor(int n){
        if(n<=1){
            System.out.println("Invalid");
        }
        while(n%2==0){
            System.out.println(2);
            n/=2;
        }
        while(n%3==0){
            System.out.println(3);
            n/=3;
        }   
        for(int i =5;i*i<=n;i+=6){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n/=(i+2);
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }

}