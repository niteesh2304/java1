import java.util.Scanner;

public class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        int power=1;

        for (int i=1;i<=expo;i++){
            power *= base; 
        }
        System.out.println(power);
    }
}