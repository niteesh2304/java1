//reverse an array

import java.util.Scanner;

public class reverse{
	
	public static void arr(int n, int []arr,Scanner sc){
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
		}
	
	public static void rev(int n,int []arr){
		int start = 0;
		int end = n-1;
		int temp = 0;
		for(int i = 0; i<n;i++){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		System.out.print("[");
		for(int i = 0; i < n ; i++){
			System.out.print(arr[i]+" ");
			}
		System.out.print("]");
		}
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("The Size =");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		rev(n,arr);
		}	
	}