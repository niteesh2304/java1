package day3;
import java.util.Scanner;


public class p7 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while(num!=0){
            num /=10;
            count++ ; 
        }
        count /=2;
        int expo = 1;
        for(int i=1;i<=count;i++){
            expo = expo *10;
        }
        int first = temp / expo; 
        int last = temp % expo;
        int sum =0;
        while(last!=0){
            int last1=last %10;//3
            sum = sum*10+last1;//143
            last /=10;//3
        }
        int total=first*expo+sum;
        System.out.println(total);
    }    
}
