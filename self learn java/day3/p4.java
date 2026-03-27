package day3;
//    12345
//    678910
//    1112131415
//    16171811920
//    2122232425 
import java.util.Scanner;
public class p4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int sum = 0;
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            sum ++;
            System.out.print(sum);
            
        }
        System.out.println("");
    }
    }
}

