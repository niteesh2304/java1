// find prime number

import java.util.Scanner;

public class p6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count = count+1; 
            }
            
        }if (count==2){
                System.out.println("Its a prime number");
            }else{
                System.out.println("Its not a prime number");
            }
    }
}