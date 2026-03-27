import java.util.Scanner;
// sum of 0 to N
public class base{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();
		int t = 0;
		for(int i=0;i<=n;i++){
			t+=i;}
		System.out.println(t);
		}
	}