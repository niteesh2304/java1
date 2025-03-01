import java.util.Scanner;
// Print the odd numbers between 1 to n;
public class p1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0 ; i <=num;i++){
            System.out.println(i);
        }
        sc.close();
    }    
}
