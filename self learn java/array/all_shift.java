//left and right shift

import java.util.Scanner;

public class all_shift{
	
	public static void arr(int n,int []arr,Scanner sc){
		System.out.println("Elements of arrays");
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
		}

	public static void right(int t,int n,int []arr){
		
		for(int i= 0 ; i<t;i++){
			int end = arr.length-1;
			int temp = arr[end];
			for(int j =0;j<arr.length-1;j++){
				arr[end] = arr[end-1];
				end--;
			if(end==0){
				arr[end] = temp;
			}
				}
			}
		}

	public static void left(int t,int n,int []arr){
		
		for(int i = 0;i<t;i++){
			int start = 0;
			int temp = arr[start];
			for(int j = 0 ; j < arr.length-1;j++){
				arr[start] = arr[start+1];
				start++;
				}
			arr[start] = temp;
			}
		}
	public static void op(int n,int []arr){
		System.out.print("[ ");
		for(int i = 0 ; i<n;i++){
			System.out.print(arr[i]+" ");
			}
		System.out.print("]");	
		}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter left '1' shifting or right '2' shifting : ");
		int shift = sc.nextInt();
		System.out.println("Enter the number of times shift : ");
		int t = sc.nextInt();
		arr(n,arr,sc);
		if(shift == 1){
			left(t,n,arr);
			op(n,arr);
			}
		else if(shift == 2){
			right(t,n,arr);
			op(n,arr);
			}
		}	
	}