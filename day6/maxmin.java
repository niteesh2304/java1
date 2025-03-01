public class maxmin{
	public static int max(int arr[]){
		int n = Integer.MIN_VALUE;
		for(int i = 0;i < arr.length;i++){
			if(n<arr[i]){
				n = arr[i];}
			}
		return n;
		}
	public static void main(String args[]){
		int arr [] = {123,52456,5647474,34234,33,21};
		int max = max(arr);
		System.out.print(max);
		}
	}