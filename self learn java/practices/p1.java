import java.util.Scanner;

public class p1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int expo = sc.nextInt();
		int power = 1;
		for(int i = 0 ;expo > i; i++){
			power = power * base;
			}
		System.out.println(power);
		}
	
	}