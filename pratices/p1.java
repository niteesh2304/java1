// Find the maximum number and minimum number in an array
public class p1{
	public static int max(int arr[]){
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
				}
			}
		return max;
		}
	public static int min(int arr[]){
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
				}
			}
		return min;
		}
		
	public static void main(String args[]){
		int arr[] = {123,54,22,21,1234};
		int max = max(arr);
		System.out.println(max);
		int min = min(arr);
		System.out.println(min);
		}
	}