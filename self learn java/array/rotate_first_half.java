//Rotate first half of elements by one ?

public class rotate_first_half{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		int half = (arr.length+1)/2;
		int end = half-1;
		int temp = arr[half-1];
		for(int i = 0;i<half-1;i++){
			arr[end] = arr[end-1];
			end--;
			}
		arr[end] = temp;
		
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i]+" ");
			}
		}	
	}