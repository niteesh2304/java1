import java.util.Scanner;

public class GCD{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int value = 0;
        if(a>b){
            value = b;
        }else{
            value = a;
        }
        int gcd=0;
        int i = value;
        while(i!=0){
            if(a%i==0 && b%i==0){
                gcd = i;
                break;
            }else{
                i--;
            }
        }
        System.out.println(gcd);
    } 
}