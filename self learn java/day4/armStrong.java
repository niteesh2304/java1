package day4;
import java.util.Scanner;
public class armStrong {
    public static int countOf(int num){
        int count =0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int power(int base,int expo){
        int power = 1;
        for(int i = 1; i <= expo;i++){
            power = power * base;
        }
        return power;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = countOf(num);
        int sum = 0;
        while(num!=0){
            int last = num %10;
            sum = sum + power(last,count);
            num /=10;
        }
        if(sum==temp){
            System.out.println("It's an armsyrong number");
        }else{
            System.out.println("It's not an armstrong number");
        }
        
    }
}
