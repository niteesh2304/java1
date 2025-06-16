// deleting a element in a array

public class deletearr{
	public static void main(String args[]){
		int []arr = {1,2,3,4,5,6};
		int []arr1 = new int[arr.length];
		int j = 0;
		for(int i = 0; i< arr.length;i++){
			if(arr[i] != 5){
				arr1[j] = arr[i];
				j++;
				}

			}
		for(int i = 0; i < j ; i++){
			System.out.println(arr1[i]);
			}
		}
	}