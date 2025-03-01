//rev the second half of the digit
package day3;
import java.util.Scanner;
public class p6 {
    public static int count(int num){
        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public static int power(int x){
        int expo = 1;
        for(int i = 0;i<x;i++){
            expo *= 10;
        }
        return expo;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = count(num);
        System.out.println(x);
        x/=2;
        int power = power(x);
        System.out.print(power);
        int firsthalf=num/100;
        int lasthalf=num%100;

        int sum = 1 ;
        int c1 = count(lasthalf);
        int p2 = power(c1);
        while(lasthalf<=0){
            int lastnumber = lasthalf %p2;
            sum = sum * p2 + lastnumber;
            lasthalf%=p2;   
        }
        int result = firsthalf + sum;
        System.out.print(result);
    }
}
