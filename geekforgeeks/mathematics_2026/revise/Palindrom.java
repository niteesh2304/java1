import java.util.Scanner;

public class Palindrom{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int number = sc.nextInt();
        int reverse = reverse(number);
        if(Palindrom(number,reverse)){
            System.out.println("THIS is an palindrom");
        }else{
            System.out.println("This is not an palindrom");
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        while(number!=0){
            int last = number %10;
            reverse = (reverse*10) + last; 
            number /=10;
        }
        return reverse;
    }
    public static boolean Palindrom(int number,int reverse){
        
        if(reverse == number){
            return true;
        }
        else{
            return false;    
        }
        
    }   
}