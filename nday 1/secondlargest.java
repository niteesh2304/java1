//Find the second largest and second smallest element.

import java.util.Scanner;

public class secondlargest{
	public static void arr(int n,int[] arr,Scanner sc){
		System.out.println("Enter the elements: ");
		
		for(int i = 0;i < n;i++){
			arr[i] = sc.nextInt();
			}
		}
	public static void seclarge(int n,int []arr){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n ; i++){
			if(max < arr[i]){
				max = arr[i];
				}
			}
		int secmax = Integer.MIN_VALUE;
		for(int i = 0; i < n ; i++){
				if(max > arr[i] && arr[i]  > secmax){
					secmax = arr[i];
					}
				}
		System.out.print(secmax);
		
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		arr(n,arr,sc);
		seclarge(n,arr); 
		}	
	}