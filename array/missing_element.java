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
		int count = count(num);
		int power = power(count);
		missing(max,min,power);
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
	public static int count(int num[]){
		int count = 0;
		while(num[0] != 0){
			num[0] /= 10;
			count++;
			}
		return count;
		}
	public static int power(int count){
		int power = 1;
		int z= 1;		
		while(z< count ){
		power = power * 10;
		}
	return power;
	}
	
	public static void missing(int max, int min ,int power){
		int num = min ; 
		while(num<=max){
		System.out.print(num+" ");
		num += power;
		}	
	}
	
}


















