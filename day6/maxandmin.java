//Write a C program to find maximum and minimum element in an array. – using recursion.
public class maxandmin{
	public static int max(int arr[]){
		int max = arr[1];
		for(int i = 0;i<arr.length;i++){
			if(max<=arr[i]){
			max = arr[i];
			}
		}
		return max;
	}
	public static int min(int arr[]){
		int min = arr[1];
		for(int i = 0;i<arr.length;i++){
			if(min>=arr[i]){
				min = arr[i];
				}
			}
			return min;
		}
	public static void main(String args[]){
		int arr[] = {5,2,4,15,6,9,1};
		int max = max(arr);
		int min = min(arr);
		System.out.print("max number is "+ max + " and the min number is "+min);
		}
	}