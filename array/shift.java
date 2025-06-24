import java.util.Scanner;
public class shift{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times shift : ");
		int n = sc.nextInt();	
		int []arr = {1,2,3};
		for(int j = 0; j < n ; j++){
			int end = arr.length -1;
			int temp = arr[arr.length - 1];
			for(int i = 0 ; i < arr.length -1 ; i++){
				arr[end] = arr[end-1];
				end--;
				if(end == 0){
					arr[end] = temp;
					}
				}
			}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
			}
		}
	}