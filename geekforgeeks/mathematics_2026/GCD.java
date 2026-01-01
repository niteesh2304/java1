import java.util.Scanner;

public class GCD{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();   
        
        if(b<a){
            System.out.println(hcf(b,a,b));
        }else{
            System.out.println(hcf(a,a,b));
        }
    }
    public static int hcf(int number,int a,int b){
        for(int i = number ; i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return  1;
    }
}