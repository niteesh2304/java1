//a to z
import java.util.Scanner;

public class p4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char start = sc.nextLine().charAt(0);
        char end =sc.nextLine().charAt(0);

        for(char i = start; i <= end;i++){
            System.out.print(i+" ");
        }
    sc.close();
    }
}