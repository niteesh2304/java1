// removing the duplicates in an array
import java.util.Scanner;

public class removeduplicate{
	public static void arr(int n,int arr[],Scanner sc){
		System.out.print("Enter the values");
		for(int i =0;i<n;i++){
			arr[i]=sc.nextInt();
			}
		}
	public static int count(int n,int arr[]){
		int count =0;
		for(int i =0; i <n;i++){
			for(int j = i+1 ; j<n ; j++){
				if(arr[i] == arr[j]){
					count++;
					}
				}
			}
		return count;
		}
	public static void duplicate(int n,int arr[],int arr1[]){
		for(int i = 0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(arr[i] != arr[j]){
					arr1[i] = arr[j];
					}
				}
			}
		}
	public static void arr1(int n,int arr1[]){
		for(int i = 0;i<arr1.length;i++){
			System.out.print(arr1[i]);
			}
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size");
		int n = sc.nextInt();
		int []arr = new int[n];
		arr(n,arr,sc);
		int count = count(n,arr);
		int []arr1 = new int[n-count];
		duplicate(n,arr,arr1);
		arr1(n,arr1);
		}
	}