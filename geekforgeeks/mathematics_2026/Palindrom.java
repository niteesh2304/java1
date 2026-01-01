import java.util.Scanner;
public class Palindrom{
    static Scanner sc = new Scanner(System.in);
    public static void main (String args[]){
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isPalindrom(n))
            System.out.println("The number is an PALINDROM");
        else
            System.out.println("The number is not an PALINDROM");
    }
    public static boolean isPalindrom(int number){
        int rev = 0;
        int temp = number;
        while(number>0){
            rev = (rev *10) + number%10;
            number /=10;
        }
        if(rev == temp)
            return true;
        else
            return false;
    }
}