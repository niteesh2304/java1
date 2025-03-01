//Write a C program to print all negative elements in an array.
public class negative{
	public static void main(String args[]){
		int arr[] = {1,2,5,-1,4,565,-7,8,3,37,-565};
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				System.out.print(arr[i]+" ");}
			}
		
		}
	}