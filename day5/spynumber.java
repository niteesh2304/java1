import java.util.Scanner;
public class spynumber{
	public static int sum(int num){
		int sum = 0;
		while(num!=0){
		sum = sum + (num%10);
		num /=10;}
		return sum;
	}
	public static int product(int num){
		int product = 1;
		while(num!=0){
		product = product * (num%10);
		num /=10;}
		return product;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sumOfDigits = sum(num);
		int productOfDigits = product(num);
		if (sumOfDigits == productOfDigits){
		System.out.println(num+" is a Spy Number");
		}else{
		System.out.println(num+" is a not a Spy Number");}
	}

}