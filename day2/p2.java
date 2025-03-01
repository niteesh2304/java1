import java.util.Scanner;// ! Print the multiplication table of any number of any range
public class p2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int range = sc.nextInt();
        for(int i=0;i<=range;i++){
            System.out.println(num + "x" + i +"="+(i*num));
        }
        sc.close();
    }
}
