// Find the sum and average of elements in an array.

import java.util.Scanner;

public class sumavg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter the array elements : ");
		for(int i = 0; i < n ; i++){
			arr[i] = sc.nextInt();
			}
		int sum = 0;
		int avg = 0;
		for(int i = 0 ; i < n ; i++){
			sum += arr[i];
			avg = sum / n;
			}
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+avg);
		}
	}
