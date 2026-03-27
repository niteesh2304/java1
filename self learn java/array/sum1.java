//Find the sum of all given elements from an int array?
//find the avg

import java.util.Scanner;

public class sum1{
	public static void arr(int n,int []arr,Scanner sc){
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n ; i++){
			arr[i] = sc.nextInt();
			}
		}
	public static void sum(int []arr){
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
			}
		System.out.println(" Average : "+(sum/arr.length));
		System.out.println(" sum : " + sum);
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size:");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		sum(arr);
		}	
	}