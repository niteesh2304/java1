//min,max,secmin and secmax of array

import java.util.Scanner;

public class min2{

	public static void arr(int n, int arr[],Scanner sc){
		for(int i = 0; i < n; i++){
			arr[i]= sc.nextInt();
			}
		}


	public static void max(int arr[],int n){
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for(int i = 0; i < n;i++){	
			if(arr[i] > max){
				max = arr[i];
				}
			}
		for(int i = 0; i< n ; i++){
			if(max > arr[i] && arr[i] > secmax){
				secmax = arr[i];
				}
			}
		System.out.println("Max :"+max);
		System.out.println("Secmax: "+secmax);
		}
	public static void min(int arr[],int n){
		int min= Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;
		for(int i = 0; i < n;i++){	
			if(arr[i] < min){
				min = arr[i];
				}
			}
		for(int i = 0; i< n ; i++){
			if(min < arr[i] && arr[i] < secmin){
				secmin = arr[i];
				}
			}
		System.out.println("Min :"+min);
		System.out.println("Secmin: "+secmin);
		}

		
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size : ");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		min(arr,n);
		max(arr,n);
		}
	}