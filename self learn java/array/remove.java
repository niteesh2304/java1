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
		int oddcount = oddcount(arr);
		int eventcount = evencount(arr);
		int arr2[] = new int[arr.length-eventcount];
		int arr3[] = new int[arr.length-oddcount];
		System.out.println();
		System.out.println("EVEN");
		even(arr,arr2,n);
		System.out.println();
		System.out.println("ODD");
		odd(arr,arr3,n);
		
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
	public static void even(int arr[],int arr2[],int n){
		int j = 0;
		for(int i = 0; i<arr.length;i++){
			if(i%2 == 1){
				arr2[j] = arr[i];
				j++;
				}
			}
		for(int i = 0 ; i < arr2.length; i++){
			System.out.print(arr2[i]);
			}
		}	
	public static void odd(int arr[],int arr3[],int n){
		int j = 0;
		for(int i = 0; i<arr.length;i++){
			if(i%2 == 0){
				arr3[j] = arr[i];
				j++;
				}
			}
		for(int i = 0 ; i < arr3.length; i++){
			System.out.print(arr3[i]);
			}
		}
	public static int evencount(int arr[]){
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			if(i%2==0){
				count++;
				}
			}
		return count;	
		}
	public static int oddcount(int arr[]){
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			if(i%2==1){
				count++;
				}
			}
		return count;	
		}
		
	}