import java.util.Scanner;

public class trailing_zeros{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
    //every 5 times there is an zero is there in the trailing zero factorial numbers 
    int n = sc.nextInt();

    int res = 0;

    for(int i = 5 ; i <= n ; i=i*5){
        res = res + (n/i);
    }
            System.out.print(res);
    }
}