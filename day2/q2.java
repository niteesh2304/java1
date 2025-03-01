import java.util.Scanner;
//Write a Java program to calculate sum of digits of a number. 
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int lastNum = 0;
        for(int i=0;num>0;i++){
            lastNum = num % 10;
            sum += lastNum;
            num /=10;
           
        }
        System.out.println(sum);
    }
}
