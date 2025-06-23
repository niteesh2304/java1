//swap Odd-Indexed Elements with Their Next Elements
import java.util.Scanner;

public class swap_odd_index_to_next_element{
	public static void arr(int n,int []arr,Scanner sc){
		for(int i = 0; i< n ; i++){
			arr[i] = sc.nextInt();
			}
		}
	public static void swap(int n,int []arr){
		for(int i = 0; i < n ; i++){
		
			if(i%2 == 1 && i+1 < n){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
			}
		}
	public static void out(int n , int []arr){
		System.out.print("[");
		for(int i = 0; i<n ; i++){
			System.out.print(arr[i]);
			}
		System.out.print("]");	
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("The size: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		swap(n,arr);
		out(n,arr);
		}	
	}