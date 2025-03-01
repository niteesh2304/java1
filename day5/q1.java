package day5;
import java.util.Scanner;

public class q1{
	public static int sum(int num){
		int sum=0;
		while(num!=0){
		sum = sum+(num%10);
		num/=10;
		}
		if(sum>10){
		return sum(sum);
		}
		
		return sum;
	}
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int sumOf = sum(num);

}}