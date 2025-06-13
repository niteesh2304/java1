//Reverse an array.
import java.util.Scanner;

public class revarr{
	public static void rev(int n,int arr[]){
		int start = 0;
		int end = n-1;
		int temp;
		while(start <= end){
			temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start ++;
			end --;
			}
		for(int i = 0;i<n;i++){
			System.out.print(arr[i]+" ");
			}
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the element: ");
		for(int i = 0;i < n; i++){
			arr[i] = sc.nextInt();
			}
		rev(n,arr);
		
		}
	}
