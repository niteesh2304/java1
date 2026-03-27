//rotate the first and second elements by separately

import java.util.Scanner;

public class all_rotate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("The Size: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		

		int half =  n/2;
		arr(arr,sc);
		shift(arr,half,0);
		shift(arr,arr.length,half);
		op(arr);
		}
	
	public static void arr(int []arr,Scanner sc){
		System.out.println("Enter the array Elements : ");
		for(int i = 0; i < arr.length ; i++){	
			arr[i] = sc.nextInt();
			}
		}
	public static void shift(int []arr,int start,int end){
		int half = arr.length/2;
		int temp = arr[start - 1];
		for(int i = start -1 ; i > end;i--){
			arr[i] = arr[i-1];
			}
		arr[end] = temp;
		}

	public static void op(int []arr){
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
				}
			}
	}