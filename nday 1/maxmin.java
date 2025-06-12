//Find the maximum and minimum element in an array.
import java.util.Scanner;
public class maxmin{
	public static int max(int n,int arr[]){
		int max = Integer.MIN_VALUE; 
		for(int i = 0;i<n;i++){
			if(arr[i]>max){
				max = arr[i];
				}
			}
		return max;
		}
	public static int min(int n,int arr[]){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n ;i++){
			if(arr[i]<min){
				min = arr[i];
				}
			}
		return min;
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Elements: ");
		for(int i = 0; i<n;i++){
			arr[i] = sc.nextInt();
			}
		System.out.println("Max :"+max(n,arr));
		System.out.println("Min :"+min(n,arr));
		}	
	}
