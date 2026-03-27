import java.util.Scanner;
//remove of duplicate element from an array

public class duplicate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size:");
		int n = sc.nextInt();
		int []arr = new int[n]; 
		arr(arr, sc);
		int count = count(arr);
		int arr1[] = new int[arr.length-count]; 
		remove(arr,arr1);
	}
	public static void arr(int arr[],Scanner sc){
		for(int i = 0 ; i < arr.length ; i++){
			arr[i]= sc.nextInt();
		}
	}
	public static int count(int arr[]){
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void remove(int []arr,int []arr1){
		int x = 0;
		for(int i = 0 ; i < arr.length;i++){
			boolean isduplicate = false;
			for(int j = i+1; j < arr.length ; j++){
				if(arr[i]==arr[j]){
					isduplicate = true;
				}
			}if(!isduplicate){
				arr1[x] = arr[i];
				x++;
			}
		}
	}
}