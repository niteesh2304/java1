public class rotate_sechalf{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		int half = arr.length/2;
		int end = arr.length-1;
		int temp = arr[end];
		for(int i = half;i<arr.length-1;i++){
			arr[end] = arr[end-1];
			end--;	
			}
		arr[end] = temp;
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
			}
		}	
	}