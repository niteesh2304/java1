import java.util.Scanner;
// Write a Java program to find maximum between three numbers.
public class hw1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        System.out.println("Enter the third value: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

    }
}
