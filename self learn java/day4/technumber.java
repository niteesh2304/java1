package day4;
import java.util.Scanner;
public class technumber {
    public static int countOf(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int power(int base,int expo){
        int power = 1;
        for(int i = 1;i <= expo;i++){
            power = power*base;
        }
        return power;    
    }
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = countOf(num);
        int halfofcount = count / 2;
        int div = power(10,halfofcount);
        int last = num %div;
        int first = num/div;
        int sum = 0;
        sum = first+last;
        int sq = sum*sum;
     
        if(sq==temp){
            System.out.print("Tech number");
        }else{
            System.out.print("It is not a techn number");
        }
    }
}
