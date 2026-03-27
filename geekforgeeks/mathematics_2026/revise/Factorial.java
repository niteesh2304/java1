import java.util.Scanner;

public class Factorial{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(number == 0){
            System.out.println("Enter a natural number");
        }
        int factorial = 1;
        for(int i = 1 ; i <= number ; i++){
            factorial = factorial *i;
        }
        System.out.println(factorial);
    }
}