import java.util.Scanner;
public class geekforgeek{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		first(n);
		}
	public static void first(int n){
		int sum=0;
		for(int i = 0;i<=n;i++){
			sum+=i;
			}
		System.out.println(sum);
		}
	}