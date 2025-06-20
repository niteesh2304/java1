//read only even indexed element from an array 
import java.util.Scanner;

public class even_index{
		
	public static void arr(int n, int []arr,Scanner sc){
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
		}
	public static void even(int n,int []arr){
		System.out.println("Normal");
		for(int i = 0 ; i <n;i++){
			if(i%2==0){
				System.out.print(arr[i]+" ");
				}
			
			}
		System.out.println(" ");
		}
	
			
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("This Size:");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		even(n,arr);
		}
	}