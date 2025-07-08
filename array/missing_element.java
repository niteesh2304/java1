//Missing Elements Between Minimum and Maximum in an Array

import java.util.Scanner;

public class missing_element{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("The Size ");
		int n = sc.nextInt();
		int []num = new int[n];
		arr(num,sc);
		int min = min(num);
		int max = max(num);
	}
	public static void arr(int num[],Scanner sc){
		for(int i = 0 ; i < num.length ; i++){
			num[i] = sc.nextInt();
		}
	}
	public static int max(int num[]){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < num.length ; i++){
			if(num[i] > max){
				max = num[i];	
			}
		}
	return max;
	}
	public static int min(int num[]){
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < num.length ; i++){
			if(num[i] < min){
				min = num[i];
			}	
		}
	return min;
	}
}