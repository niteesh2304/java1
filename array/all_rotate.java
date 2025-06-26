//rotate the first and second elements by separately

import java.util.Scanner;

public class all_rotate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("The Size: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		

		int half =  (n+1)/2;
		arr(arr,sc);
		shift(arr,0,half);
		shift(arr,half,n);
		op(arr);
		}
	
	public static void arr(int []arr,Scanner sc){
		System.out.println("Enter the array Elements : ");
		for(int i = 0; i < arr.length ; i++){	
			arr[i] = sc.nextInt();
			}
		}
	public static void shift(int []arr,int start,int end){
			int temp = arr[arr.length-1];
			for(int  i = start; i<arr.length-1;i++){
				arr[end] = arr[end-1];
				end--;
				}
			arr[end] = temp;
			}

	public static void op(int []arr){
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
				}
			}
	}