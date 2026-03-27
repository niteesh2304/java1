import java.util.Scanner;
//count the digit
public class p3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for(i = 0;num>0;i++){
            num= num/10;
        }
        System.out.println(i);
    sc.close();
    }
}