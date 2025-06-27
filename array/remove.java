//Remove Element at Specified Index from Array
import java.util.Scanner;
public class remove{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		arr(arr,sc,n);
		System.out.print("Enter the target value: ");
		int index = sc.nextInt();
		int arr1[] = new int[arr.length-1];
		remove(arr,arr1,n,index);
		}
		
	public static void arr(int arr[],Scanner sc,int n){
		System.out.println("Elements");
		for(int i = 0 ; i < n ; i++){
			arr[i]= sc.nextInt();
			}
			}	
	public static void remove(int arr[],int arr1[],int n,int index){
		int j = 0;
		for(int i = 0; i<arr.length-1;i++){
			if(i != index){
				arr1[j] = arr[i];
				j++;
				}
			}
		for(int i = 0 ; i < arr1.length; i++){
			System.out.print(arr1[i]);
			}	
		}
	}