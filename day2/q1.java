import java.util.Scanner;
//Reverse multiplication table

public class q1 {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = sc.nextInt();
        for (int i = start;i>0;i--){

            System.out.println(num+"x"+i+"="+(num*i));
        }
        sc.close();
    }
}
