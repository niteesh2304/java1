// [1,2,3] --> [2,3,1]

public class left_shift{
	public static void main(String args[]){
		int [] arr = {1,2,3,4};
		int start = 0;
		int temp = arr[start];
		for(int i = 0;i < arr.length-1;i++){
			arr[start] = arr[start+1];
			start++;
			}
		arr[start] = temp;
		System.out.print("[ ");
		for(int i = 0;i<arr.length ; i++){
			System.out.print(arr[i]+" ");
			}	
		System.out.print("]");
	
		}	
	}