import java.util.Scanner;
public class oneToTen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i<=num;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
