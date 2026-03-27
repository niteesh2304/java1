import java.util.Scanner;

public class lcm{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=1;
        while(true){
            int x=a*i;
            int y=b*i;
            if(x==y){
                System.out.println(i);
                break;
            }else{
                i++;
            }
        }
    } 
}