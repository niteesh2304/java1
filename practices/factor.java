import java.util.Scanner;

        // Write a Java program to find all factors of a number.
public class factor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 2;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");}
			}
		}
	}