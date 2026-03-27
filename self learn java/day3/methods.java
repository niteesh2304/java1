package day3;
import java.util.Scanner;


public class methods{
    public static int age(int a,int b){
        return a + b;
    }
    public static void multiplication(int a,int b){
        System.out.print(a*b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int z = age(a, b);
        System.out.println(z);
        multiplication(a, b);
        sc.close();
    }
}