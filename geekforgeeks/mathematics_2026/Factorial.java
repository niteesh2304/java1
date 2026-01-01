import java.util.Scanner;
public class Factorial{
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[]){
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        factorialOfNumber(n);
    }
    public static void factorialOfNumber(int n){
        int factorial = 1;
        for(int i = 1 ; i <= n ; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}