package day4;
import java.util.Scanner;
public class neon {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int sq = num * num ;
        int sum = 0;
        while(sq != 0){
            sum = sum + sq % 10;
            sq /= 10;
        }
        if(sum == temp){
            System.out.println(temp +" is a Neon number");
        }else{
            System.out.println(temp +" is not a Neon number");
        }
    }
}
