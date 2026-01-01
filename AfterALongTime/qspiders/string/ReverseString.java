import java.util.Scanner;
public class ReverseString{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){ 
        System.out.println("Enter the string : ");
        String name = sc.nextLine();
        String reverse = "";
        for(int i = name.length()-1 ; i >=0;i--){
            reverse += name.charAt(i); 
        }
        System.out.println(reverse);
    }
}