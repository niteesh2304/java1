import java.util.Scanner;


public class lcm_efficient{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm = lcm(a,b);
		System.out.println(lcm);
	}
	public static int gcd(int a, int b){
	    if(b==0){
	        return a;
	    }else{
	        return gcd(b,a%b);
	    }
	}
	public static int lcm(int a , int b){
	    return(a*b)/gcd(a,b);
	}
}